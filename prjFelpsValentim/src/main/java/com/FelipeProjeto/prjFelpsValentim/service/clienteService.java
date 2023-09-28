package com.FelipeProjeto.prjFelpsValentim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FelipeProjeto.prjFelpsValentim.enties.Clientes;
import com.FelipeProjeto.prjFelpsValentim.repositories.ClienteRepository;

@Service
public class clienteService {
	private final ClienteRepository clienteRepository;

	@Autowired
	public clienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
		
	}
	
	public Clientes saveCliente(Clientes cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Clientes> getAllCliente(){
		return clienteRepository.findAll();
	}
	
	public Clientes getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
	
}
