package com.java.atv.negocio;

import java.util.List;
import com.java.atv.io.Entrada;
import com.java.atv.modelo.Cliente;

public class EdicaoCliente extends Edicao {
	private List<Cliente> clientes;
	private Entrada entrada;

	public EdicaoCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}

	@Override
	public void editar() {

		System.out.println("======================================");
		System.out.println("Identifique o cliente utilizando o CPF:");
		Entrada entrada = new Entrada();
		String cpf = entrada.receberTexto();
		SelecaoCliente selecionador = new SelecaoCliente(clientes, cpf);
		Cliente clienteselecionado = selecionador.selecionar();

		System.out.println("Qual informação deseja alterar?");
		System.out.println("1 - Nome");
		System.out.println("2 - Gênero");
		System.out.println("3 - Telefone");

		Entrada entrada2 = new Entrada();
		int operacao2 = entrada.receberNumeroInteiro();
		switch (operacao2){
		case 1:
			System.out.println("Informe o nome do cliente:");
			clienteselecionado.nome = entrada2.receberTexto();
			break;
		case 2:
			System.out.println("Informe o gênero:");
			System.out.println("1 - Masculino");
			System.out.println("2 - Feminino");
			String gen = entrada2.receberTexto();
			if (gen.equals("1")) {
				clienteselecionado.genero = "Masculino";
			} else {
				clienteselecionado.genero = "Feminino";
			}
			break;
		case 3:
			System.out.println("Insira a posição do telefone na lista que deseja alterar");
			System.out.println("Exemplo:");
			System.out.println("1 - Primeiro item da lista");
			System.out.println("2 - Segundo item da lista");
			int item = entrada.receberNumeroInteiro();
			item = item-1;
			Entrada entrada3 = new Entrada();
			System.out.println("Insira o DDD");
			String dddNovo = entrada3.receberTexto();
			clienteselecionado.getTelefones().get(item).setDdd(dddNovo);
			System.out.println("Insira o número");
			String numeroNovo = entrada3.receberTexto();
			clienteselecionado.getTelefones().get(item).setNumero(numeroNovo);
			break;


		}
	}
}