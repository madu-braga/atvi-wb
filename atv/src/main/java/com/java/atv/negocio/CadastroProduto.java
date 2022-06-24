package com.java.atv.negocio;

import java.util.List;

import com.java.atv.io.Entrada;
import com.java.atv.modelo.Produto;

public class CadastroProduto extends Cadastro {
	private List<Produto> produtos;
	private Entrada entrada;

	public CadastroProduto(List<Produto> produtos) {
		this.produtos = produtos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("======================================");
		System.out.println("INÍCIO DO CADASTRO DO PRODUTO");
		System.out.println("Informe o nome do produto:");
		String nome = entrada.receberTexto(); //NOME PRODUTO
		System.out.println("Insira o valor do produto:");
		Number valor = entrada.receberNumeroDouble(); //VALOR PRODUTO
		System.out.println("======================================");
		
		Produto produto = new Produto(nome, valor);
		produto.nome = nome;
		produto.valor = valor;
		this.produtos.add(produto);

	}

}

