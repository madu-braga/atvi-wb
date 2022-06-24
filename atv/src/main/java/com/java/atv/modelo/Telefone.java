package com.java.atv.modelo;

public class Telefone {
	private String ddd;
	private String numero;
	public Telefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}

	public void setDdd(String dddNovo) {
		ddd = dddNovo;
	}
	public String getDdd() {
		return ddd;
	}
	public void setNumero(String numeroNovo) {
		numero = numeroNovo;
	}
	public String getNumero() {
		return numero;
	}
}