package com.java.atv.negocio;

import java.util.List;

import com.java.atv.modelo.Cliente;
import com.java.atv.modelo.Telefone;

public class ListarTodosClientes extends Listagem {
	private List<Cliente> clientes;

	public ListarTodosClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("======================================");
		System.out.println("LISTA DE TODOS OS CLIENTES:");
		for (Cliente cliente : clientes) {
			System.out.println("--------------------------------------");
			System.out.println("Nome: " + cliente.nome);
			System.out.println("Gênero: " + cliente.genero);
			System.out.println("CPF: " + cliente.getCpf().getValor());
			System.out.println("RG: " + cliente.getRgs().getValor());
			for(Telefone telefone: cliente.getTelefones()) {
				System.out.println("Telefone: ("+ telefone.getDdd()+") "+telefone.getNumero());
			}
		}
		System.out.println("======================================");
	}
}