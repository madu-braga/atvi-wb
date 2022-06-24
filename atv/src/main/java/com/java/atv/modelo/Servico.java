package com.java.atv.modelo;

public class Servico {
	public String nome;
	public Number valor;
	public Servico(String nome, Number valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
}
