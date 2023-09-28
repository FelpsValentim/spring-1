package com.FelipeProjeto.prjFelpsValentim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FelipeProjeto.prjFelpsValentim.enties.Clientes;
import com.FelipeProjeto.prjFelpsValentim.repositories.ClienteRepository;
import com.FelipeProjeto.prjFelpsValentim.service.clienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	private final clienteService ClienteService;

	@Autowired
	public ClienteController(clienteService ClienteService) {
		this.ClienteService = ClienteService;
	}

	@PostMapping
	public Clientes createCliente(@RequestBody Clientes cliente) {
		return ClienteService.saveCliente(cliente);
	}

	@GetMapping("/{id}")
	public Clientes getCliente(@PathVariable Long id) {
		return ClienteService.getClienteById(id);
	}

	@GetMapping
	public List<Clientes> getAllCliente() {
		return ClienteService.getAllCliente();
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Long id) {
		ClienteService.deleteCliente(id);
		}
}
