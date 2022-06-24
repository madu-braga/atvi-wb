package com.java.atv.negocio;

import java.util.List;

import com.java.atv.modelo.Produto;

public class ListarTodosProdutos extends Listagem {
	private List<Produto> produtos;

	public ListarTodosProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public void listar() {
		System.out.println("======================================");
		System.out.println("LISTA DE TODOS OS PRODUTOS:");
		for (Produto produto : produtos) {
			System.out.println("--------------------------------------");
			System.out.println("Nome: " + produto.nome);
			System.out.println("Valor: R$ " + produto.valor);
		}
		System.out.println("======================================");
	}

}
