package com.java.atv.negocio;

import java.util.List;
import com.java.atv.modelo.Cliente;

public class SelecaoCliente {
	private List<Cliente> clientes;
	private String cpf;
	
	public SelecaoCliente(List<Cliente> clientes, String cpf) {
		this.clientes = clientes;
		this.cpf = cpf;
	}
	
	public Cliente selecionar() {
		Cliente selecionado = null;
		for(Cliente c : clientes) {
			if(c.getCpf().getValor().equals(cpf)) {
				selecionado = c;
			}
		}
		return selecionado;
	}
	
}