package com.java.atv.negocio;

import java.util.List;
import com.java.atv.io.Entrada;
import com.java.atv.modelo.Servico;

public class CadastroServico extends Cadastro {
	private List<Servico> servicos;
	private Entrada entrada;
	
	public CadastroServico(List<Servico> servicos) {
		this.servicos = servicos;
		this.entrada = new Entrada();
	}

	@Override
	public void cadastrar() {
		System.out.println("======================================");
		System.out.println("INÍCIO DO CADASTRO DO SERVIÇO");
		System.out.println("Informe o nome do serviço:");
		String nome = entrada.receberTexto(); //NOME DO SERVIÇO
		System.out.println("Informe o valor do serviço:");
		Number valor = entrada.receberNumeroDouble();
		System.out.println("======================================");
		
		Servico servico = new Servico(nome, valor);
		servico.nome = nome;
		servico.valor = valor;
		this.servicos.add(servico);
	}

}