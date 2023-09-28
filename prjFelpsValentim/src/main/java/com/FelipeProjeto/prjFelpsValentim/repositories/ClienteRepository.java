package com.FelipeProjeto.prjFelpsValentim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FelipeProjeto.prjFelpsValentim.enties.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes,Long> {

	
	
}
