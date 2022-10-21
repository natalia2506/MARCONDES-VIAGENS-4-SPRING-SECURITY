package com.marcondes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcondes.dto.UsuarioAcessoDTO;
import com.marcondes.model.entities.Usuario;
import com.marcondes.service.AcessoService;
import com.marcondes.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService  usuarioService;

	@Autowired
	AcessoService  acessoService;
	
	@PostMapping("/create")
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
		
	}
	
	@PostMapping("/acesso")
	public Usuario acesso(@RequestBody UsuarioAcessoDTO usuarioAcessoDTO) {
		return acessoService.executar(usuarioAcessoDTO);
	}
	
	
	

}
