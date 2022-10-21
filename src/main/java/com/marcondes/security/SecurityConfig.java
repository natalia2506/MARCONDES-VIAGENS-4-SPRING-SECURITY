package com.marcondes.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@Component
public class SecurityConfig {
	
	
	private final UsuarioDetailsService usuarioDetailsService;
	
	
  
	public SecurityConfig(UsuarioDetailsService usuarioDetailsService) {
		this.usuarioDetailsService = usuarioDetailsService;
	}

	@Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
	public SecurityFilterChain filterChain
	(HttpSecurity http) throws Exception {
		return http
				.csrf().disable()
				.authorizeRequests(auth -> auth
						.antMatchers("/home", "/destinos", "/promocoes", "/contato",
								"/login", "/usuario/acesso", "/usuario/create").permitAll()
						.anyRequest().authenticated()
						)
				.userDetailsService(usuarioDetailsService)
				.headers(headers-> headers.frameOptions().sameOrigin())
				
				.httpBasic(withDefaults())
				.build();
    }

}
