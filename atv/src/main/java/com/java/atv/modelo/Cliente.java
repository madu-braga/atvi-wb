package com.java.atv.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String nome;
	public String nomeSocial;
	private CPF cpf;
	private List<RG> rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	private List<Produto> produtosConsumidos;
	private List<Servico> servicosConsumidos;
	public Cliente(String nome, String nomeSocial, CPF cpf) {
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.rgs = new ArrayList<>();
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<>();
		this.produtosConsumidos = new ArrayList<>();
		this.servicosConsumidos = new ArrayList<>();
	}
	public CPF getCpf() {
		return cpf;
	}
	public List<RG> getRgs() {
		return rgs;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public List<Produto> getProdutosConsumidos() {
		return produtosConsumidos;
	}
	public List<Servico> getServicosConsumidos() {
		return servicosConsumidos;
	}
}
