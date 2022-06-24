package com.java.atv.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	private List<Produto> produtos;
	private List<Servico> servicos;
	public Empresa() {
		this.clientes = new ArrayList<>();
		this.produtos = new ArrayList<>();
		this.servicos = new ArrayList<>();
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
}
