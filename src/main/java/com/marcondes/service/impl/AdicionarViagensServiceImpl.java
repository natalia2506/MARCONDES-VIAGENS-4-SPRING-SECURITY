package com.marcondes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcondes.exception.ResourceNotFoundException;
import com.marcondes.model.entities.AdicionarViagens;

import com.marcondes.repositories.AdicionarViagensRepository;
import com.marcondes.service.AdicionarViagensService;


@Service
public class AdicionarViagensServiceImpl implements AdicionarViagensService {

	@Autowired
	AdicionarViagensRepository addViagensRepository;
	
	@Override
	public List<AdicionarViagens> listAll() {
	
		return addViagensRepository.findAll();
	}

	@Override
	public AdicionarViagens saveAdicionarViagens(AdicionarViagens adicionarViagens) {
		return addViagensRepository.save(adicionarViagens);
	}

	@Override
	public void deleteAdicionarViagens(long id) {
		addViagensRepository.findById(id).orElseThrow(() -> 
		new ResourceNotFoundException("AdicionarViagens", "id", id));

		addViagensRepository.deleteById(id);
	}

	
}
