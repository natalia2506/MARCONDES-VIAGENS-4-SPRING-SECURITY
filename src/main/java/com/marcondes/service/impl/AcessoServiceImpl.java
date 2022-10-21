package com.marcondes.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcondes.dto.UsuarioAcessoDTO;
import com.marcondes.model.entities.Acesso;
import com.marcondes.model.entities.Usuario;
import com.marcondes.repositories.UsuarioRepository;
import com.marcondes.service.AcessoService;

@Service
public class AcessoServiceImpl implements AcessoService {
	
	@Autowired
	UsuarioRepository userRepository;

	@Override
	public Usuario executar(UsuarioAcessoDTO usuarioAcessoDTO) {
		
		Optional<Usuario> usuarioExiste = userRepository.findById(usuarioAcessoDTO.getIdUser());
		
		List<Acesso> acessos = new ArrayList<>();
		
		if(usuarioExiste.isEmpty()) {
			throw new Error("Usuario não encontrado.");
		}
		
		acessos = usuarioAcessoDTO.getIdsAcesso().stream().map(acesso -> {
			return new Acesso(acesso);
		}).collect(Collectors.toList());
		
		Usuario usuario = usuarioExiste.get();
		
		usuario.setAcessos(acessos);
		
		userRepository.save(usuario);
		
		return usuario;
	}

}
