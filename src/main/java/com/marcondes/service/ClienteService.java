package com.marcondes.service;

import java.util.List;

import com.marcondes.model.entities.Cliente;



public interface ClienteService {
	
	List<Cliente> getAllClientes();
	Cliente getClienteById(long id);
	Cliente saveCliente(Cliente cliente);
	Cliente updateCliente(Cliente cliente, long id);
	void deleteCliente(long id);

}
