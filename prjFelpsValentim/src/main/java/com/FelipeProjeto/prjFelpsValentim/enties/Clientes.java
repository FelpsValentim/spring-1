package com.FelipeProjeto.prjFelpsValentim.enties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;

	@Column(name = "cliente")
	private String cliente;

	@Column(name = "fone")
	private String fone;

	public Clientes() {

	}

	public Clientes(Long idcCliente, String cliente, String fone) {
		super();
		this.idcCliente = idcCliente;
		this.cliente = cliente;
		this.fone = fone;
	}

	public Long getIdcCliente() {
		return idcCliente;
	}

	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
