package com.java.atv.negocio;

import java.util.List;
import com.java.atv.modelo.Cliente;
import com.java.atv.modelo.Telefone;

public class ListarClientesMasculinos extends Listagem {
	private List<Cliente> clientes;

	public ListarClientesMasculinos(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		System.out.println("======================================");
		System.out.println("LISTA DE CLIENTES DO GÊNERO MASCULINO:");
		for (Cliente cliente : clientes) {
			if (cliente.genero == "Masculino") {
				System.out.println("--------------------------------------");
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Gênero: " + cliente.genero);
				System.out.println("CPF: " + cliente.getCpf().getValor());
				System.out.println("RG: " + cliente.getRgs().getValor());
				for(Telefone telefone: cliente.getTelefones()) {
					System.out.println("Telefone: ("+ telefone.getDdd()+") "+telefone.getNumero());
				}
			}
		}
		System.out.println("======================================");
	}
}
