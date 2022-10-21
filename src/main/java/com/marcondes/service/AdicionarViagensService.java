package com.marcondes.service;

import java.util.List;

import com.marcondes.model.entities.AdicionarViagens;


public interface AdicionarViagensService {
	
	AdicionarViagens saveAdicionarViagens(AdicionarViagens adicionarViagens);
	List<AdicionarViagens>listAll();
	void deleteAdicionarViagens(long id);

}
