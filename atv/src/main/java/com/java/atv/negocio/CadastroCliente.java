package com.java.atv.negocio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.java.atv.io.Entrada;
import com.java.atv.modelo.CPF;
import com.java.atv.modelo.Cliente;
import com.java.atv.modelo.RG;
import com.java.atv.modelo.Telefone;

public class CadastroCliente extends Cadastro {
	private List<Cliente> clientes;
	private Entrada entrada;

	public CadastroCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	private boolean cadastraNumero = true;
	

	@Override
	public void cadastrar() {
		System.out.println("==================================================================");
		System.out.println("CADASTRO DE CLIENTE\n");
		System.out.println("Informe o nome do cliente:");
		String nome = entrada.receberTexto();  //NOME
		System.out.println("Informe o nome social do cliente:");
		String nomeSocial = entrada.receberTexto();  //NOME SOCIAL
		System.out.println("Informe o g麩ero:");
		System.out.println("1 - Masculino");
		System.out.println("2 - Feminino");
		String gen = entrada.receberTexto(); //GﾊNERO
		String genero = null;
		if (gen.equals("1")) {
			genero = "Masculino";
		} else {
			genero = "Feminino";
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("DOCUMENTOS\n");
		System.out.println("Informe o n伹ero do cpf:");
		String valor = entrada.receberTexto();  //VALOR CPF
		System.out.println("Informe a data de emiss縊 do cpf, no padrão dd/mm/yyyy:");
		String data = entrada.receberTexto();  //DATA DE EMISSﾃグ CPF
		System.out.println("Informe o n伹ero do rg:");
		String valorrg = entrada.receberTexto(); //VALOR RG
		System.out.println("Informe a data de emiss縊 do rg, no padrão dd/mm/yyyy:");
		String datarg = entrada.receberTexto(); //DATA DE EMISSﾃO RG
		System.out.println("------------------------------------------------------------------");
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataEmissao = LocalDate.parse(data, formato);
		CPF cpf = new CPF(dataEmissao, valor);
		LocalDate dataEmissaorg = LocalDate.parse(datarg, formato);
		RG rg = new RG(dataEmissaorg, valorrg);
		Cliente cliente = new Cliente(nome, genero, cpf, rg);
		this.clientes.add(cliente);
		
		System.out.println("TELEFONE\n");
		while (cadastraNumero) {
			System.out.println("Informe o número do DDD:");
			String ddd = entrada.receberTexto();  //DDD
			System.out.println("Informe o número do telefone:");
			String numero = entrada.receberTexto(); //NﾚMERO
			Telefone telefone = new Telefone(ddd, numero);
			cliente.getTelefones().add(telefone);
			System.out.println("Deseja cadastrar outro n伹ero?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			String outroNumero = entrada.receberTexto();
			if(outroNumero.equals("1")) {
				cadastraNumero = true;
			} else {
				cadastraNumero = false;
			}
		}
		System.out.println("======================================");
	}
}