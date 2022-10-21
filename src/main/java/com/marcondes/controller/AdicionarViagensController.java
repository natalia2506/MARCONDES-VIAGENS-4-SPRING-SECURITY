package com.marcondes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcondes.model.entities.AdicionarViagens;
import com.marcondes.service.AdicionarViagensService;

@RestController
@RequestMapping("/addviagens")
public class AdicionarViagensController {
	
	@Autowired
	AdicionarViagensService  adicionarViagensService;
	
	@GetMapping
	public List<AdicionarViagens> list(){
		return adicionarViagensService.listAll() ;
	}
	
	@PostMapping
	public ResponseEntity<AdicionarViagens> saveAdicionarViagens(@RequestBody AdicionarViagens adicionarViagens){
		return new ResponseEntity<AdicionarViagens>(adicionarViagensService.saveAdicionarViagens(adicionarViagens), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteAdicionarViagens(@PathVariable("id") long id){
		adicionarViagensService.deleteAdicionarViagens(id);
		
		return new ResponseEntity<String>("deletado com sucesso.", 
				HttpStatus.OK);
	}

}
