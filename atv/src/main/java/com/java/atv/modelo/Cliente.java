package com.java.atv.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public String genero;
	public String nome;
	private CPF cpf;
	private RG rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	private List<Produto> produtosConsumidos;
	private List<Servico> servicosConsumidos;
	public Cliente(String nome,String genero, CPF cpf, RG rg) {
		this.genero = genero;
		this.nome = nome;
		this.cpf = cpf;
		this.rgs = rg;
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<>();
		this.produtosConsumidos = new ArrayList<>();
		this.servicosConsumidos = new ArrayList<>();
	}
	public CPF getCpf() {
		return cpf;
	}
	public RG getRgs() {
		return rgs;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setTelefones(List<Telefone> telefonesNovos) {
		telefones = telefonesNovos;
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
