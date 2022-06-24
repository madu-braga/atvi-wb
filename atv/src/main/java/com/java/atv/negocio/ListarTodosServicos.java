package com.java.atv.negocio;

import java.util.List;

import com.java.atv.modelo.Servico;

public class ListarTodosServicos extends Listagem {
	private List<Servico> servicos;
	
	public ListarTodosServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	@Override
	public void listar() {
		System.out.println("======================================");
		System.out.println("LISTA DE TODOS OS SERVIÇOS");
		for (Servico servico : servicos) {
			System.out.println("--------------------------------------");
			System.out.println("Nome: " + servico.nome);
			System.out.println("Valor: R$ " + servico.valor);
		}
		System.out.println("======================================");
	}

}
