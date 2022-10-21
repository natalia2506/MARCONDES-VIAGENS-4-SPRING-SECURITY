package com.marcondes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcondes.exception.ResourceNotFoundException;
import com.marcondes.model.entities.Cliente;
import com.marcondes.repositories.ClienteRepository;
import com.marcondes.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> getAllClientes() { 
		return clienteRepository.findAll();
	}
	
	@Override
	public Cliente getClienteById(long id) { 
		return clienteRepository.findById(id).orElseThrow(() -> 
				new ResourceNotFoundException("Clientes", "id", id));
	}
	
	@Override
	public Cliente saveCliente(Cliente cliente) { 
		return clienteRepository.save(cliente);
	}
	

	
	@Override
	public Cliente updateCliente(Cliente cliente, long id) {
		
		Cliente clienteExistente = clienteRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Cliente", "id", id));
		
		clienteExistente.setNome(cliente.getNome());
		clienteExistente.setNomeSocial(cliente.getNomeSocial());
		clienteExistente.setDataNascimento(cliente.getDataNascimento());
		clienteExistente.setIdentidade(cliente.getIdentidade());
		clienteExistente.setCpf(cliente.getCpf());
		clienteExistente.setCelular(cliente.getCelular());
		clienteExistente.setEndereco(cliente.getEndereco());
		clienteExistente.setCidade(cliente.getCidade());
		clienteExistente.setEstado(cliente.getEstado());
		clienteExistente.setCep(cliente.getCep());
		clienteExistente.setEmail(cliente.getEmail());
		
		clienteRepository.save(clienteExistente);
		return clienteExistente;
	}
	
	@Override
	public void deleteCliente(long id) { 
		clienteRepository.findById(id).orElseThrow(() -> 
				new ResourceNotFoundException("Cliente", "id", id));
		
		clienteRepository.deleteById(id);
	}

	
}

	

