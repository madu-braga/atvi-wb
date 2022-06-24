package com.java.atv.negocio;

import java.util.List;
import com.java.atv.modelo.Servico;

public class SelecaoServico {
	private List<Servico> servicos;
	private String nome;
	
	public SelecaoServico(List<Servico> servicos, String nome) {
		this.servicos = servicos;
		this.nome = nome;
	}
	
	public Servico selecionar() {
		Servico selecionado = null;
		for(Servico s : servicos) {
			if(s.getNome().equals(nome)) {
				selecionado = s;
			}
		}
		return selecionado;
	}
}