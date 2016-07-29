package io.jessicathaisa.comunidadeligada.seguranca;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@EnableWebSecurity
@Configuration
public class ConfiguradorSeguranca extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.anyRequest().fullyAuthenticated()
			.and()
				.formLogin()
					.usernameParameter("usuario")
					.passwordParameter("senha")
					.successHandler(successHandler())
					.failureHandler(authenticationFailureHandler())
			.and()
				.csrf().disable();
	}

	private AuthenticationFailureHandler authenticationFailureHandler() {
		return new AuthenticationFailureHandler() {
			
			@Override
			public void onAuthenticationFailure(HttpServletRequest arg0, HttpServletResponse arg1, AuthenticationException arg2)
					throws IOException, ServletException {
				arg1.setStatus(401);
				arg1.sendError(HttpServletResponse.SC_UNAUTHORIZED);
			}
		};
	}

	private AuthenticationSuccessHandler successHandler() {
		return new AuthenticationSuccessHandler() {
			
			@Override
			public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1, Authentication arg2)
					throws IOException, ServletException {
			}
		};
	}
}
