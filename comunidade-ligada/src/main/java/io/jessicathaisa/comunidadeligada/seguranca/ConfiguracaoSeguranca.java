package io.jessicathaisa.comunidadeligada.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class ConfiguracaoSeguranca extends GlobalAuthenticationConfigurerAdapter {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService());
	}

	private UserDetailsService userDetailsService() {
		return new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
				Usuario usuario = usuarioDAO.findByLogin(login);

				if (usuario != null) {
					return new User(usuario.getLogin(), usuario.getSenha(),
							AuthorityUtils.createAuthorityList(usuario.getPermissoes().toArray(new String[0])));
				} else {
					throw new UsernameNotFoundException("Usuario nao encontrado com o login informado");
				}
			}
		};
	}

}
