package com.marcondes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.marcondes.model.entities.Usuario;
import com.marcondes.repositories.UsuarioRepository;
import com.marcondes.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository userRepository;
	
	private BCryptPasswordEncoder  passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

	@Override
	public Usuario save(Usuario usuario) {
		Usuario existeUsuario = userRepository.findByEmail(usuario.getEmail());
		
		if(existeUsuario != null) {
			throw new Error("Usuário existente.");
		}
		
		usuario.setSenha( passwordEncoder().encode(usuario.getSenha()));
		
		Usuario usuarioCriado =  userRepository.save(usuario);
		
		return usuarioCriado;
	}


}
