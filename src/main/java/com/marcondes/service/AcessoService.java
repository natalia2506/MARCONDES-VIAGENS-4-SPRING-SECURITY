package com.marcondes.service;

import com.marcondes.dto.UsuarioAcessoDTO;
import com.marcondes.model.entities.Usuario;

public interface AcessoService {
	
	Usuario executar(UsuarioAcessoDTO usuarioacessoDTO); //add

}
