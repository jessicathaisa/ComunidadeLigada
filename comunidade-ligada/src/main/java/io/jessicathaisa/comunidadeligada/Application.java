package io.jessicathaisa.comunidadeligada;

import java.util.Arrays;
import java.util.HashSet;

import org.h2.server.web.WebServlet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.jessicathaisa.comunidadeligada.seguranca.Usuario;
import io.jessicathaisa.comunidadeligada.seguranca.UsuarioDAO;

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
	CommandLineRunner createUsers(UsuarioDAO a) {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				Usuario usuario = new Usuario();
				usuario.setLogin("teste");
				usuario.setSenha("teste");
				usuario.setPermissoes(new HashSet<String>(Arrays.asList("USUARIO")));
				a.save(usuario);
			}
		};
	}
}