package com.java.atv.negocio;

import java.util.List;

import com.java.atv.io.Entrada;
import com.java.atv.modelo.Servico;

public class RemocaoServico extends Edicao {
	private List<Servico> servicos;
	private Entrada entrada;
	
	public RemocaoServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}
	
	@Override
	public void editar() {
		System.out.println("======================================");
		System.out.println("Identifique o serviço pelo nome:");
		Entrada entrada = new Entrada();
		String nome = entrada.receberTexto();
		
		for(int i = 0; i< servicos.size(); i++) {
			Servico p = servicos.get(i);
			if(p.nome.equals(nome)) {
				servicos.remove(p);
				break;
			}
		}
	}}
