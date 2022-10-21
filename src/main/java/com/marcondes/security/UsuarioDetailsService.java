package com.marcondes.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.marcondes.model.entities.Usuario;
import com.marcondes.repositories.UsuarioRepository;

public class UsuarioDetailsService implements UserDetailsService {

	@Autowired
	UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = userRepository.findByUsernameFetchRoles(username);
		if(usuario==null)
			usuario = userRepository.findByEmail(username);
		if(usuario==null)
			throw new Error("Usuario inexistente");
		return new UsuarioPrincipal(usuario);
	}
}
