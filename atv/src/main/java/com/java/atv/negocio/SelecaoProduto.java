package com.java.atv.negocio;

import java.util.List;
import com.java.atv.modelo.Produto;

public class SelecaoProduto {
	private List<Produto> produtos;
	private String nome;
	
	public SelecaoProduto(List<Produto> produtos, String nome) {
		this.produtos = produtos;
		this.nome = nome;
	}
	
	public Produto selecionar() {
		Produto selecionado = null;
		for(Produto p : produtos) {
			if(p.getNome().equals(nome)) {
				selecionado = p;
			}
		}
		return selecionado;
	}
}
