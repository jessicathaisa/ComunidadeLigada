package io.jessicathaisa.comunidadeligada;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.h2.server.web.WebServlet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.jessicathaisa.comunidadeligada.prestador.Prestador;
import io.jessicathaisa.comunidadeligada.prestador.RepositorioPrestador;
import io.jessicathaisa.comunidadeligada.seguranca.Usuario;
import io.jessicathaisa.comunidadeligada.seguranca.UsuarioDAO;
import io.jessicathaisa.comunidadeligada.servico.Oferta;
import io.jessicathaisa.comunidadeligada.servico.RepositorioOferta;
import io.jessicathaisa.comunidadeligada.servico.RepositorioServico;
import io.jessicathaisa.comunidadeligada.servico.Servico;

@SpringBootApplication
@EnableJpaRepositories
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}

	@Bean
	CommandLineRunner createUsers(UsuarioDAO a, RepositorioServico servicoRepo, RepositorioPrestador prestadorRepo, RepositorioOferta ofertaRepo) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				Usuario usuario = new Usuario();
				usuario.setLogin("teste");
				usuario.setSenha("teste");
				usuario.setPermissoes(new HashSet<String>(Arrays.asList("CLIENTE")));
				a.save(usuario);
				
				Servico servicoTeste = new Servico();
				servicoTeste.setNome("Servico de teste");
				servicoTeste.setDescricao("Servico com a finalidade de teste");
				servicoRepo.save(servicoTeste);
				
				Prestador prestadorTeste = new Prestador();
				prestadorTeste.setNome("Prestador com o nome teste");
				prestadorRepo.save(prestadorTeste);
				
				Oferta oferta = new Oferta();
				oferta.setDataInicio(new Date());
				oferta.setDataFim(new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(10)));
				oferta.setPrestador(prestadorTeste);
				oferta.setServico(servicoTeste);
				oferta.setValor(100f);
				oferta.setValida(true);
				ofertaRepo.save(oferta);
				
				List<Oferta> ofertas = ofertaRepo.findAll();
			}
		};
	}
}