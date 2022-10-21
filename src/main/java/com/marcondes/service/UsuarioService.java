package com.marcondes.service;



import com.marcondes.model.entities.Usuario;

public interface UsuarioService<BCryptPasswordEncoder> {
	
	BCryptPasswordEncoder senhaEncoder();
	
	Usuario save(Usuario usuario);

}
