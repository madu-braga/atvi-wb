package com.java.atv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.atv.io.Entrada;
import com.java.atv.modelo.Empresa;
import com.java.atv.negocio.Cadastro;
import com.java.atv.negocio.CadastroCliente;
import com.java.atv.negocio.Listagem;
import com.java.atv.negocio.ListarTodosClientes;

@SpringBootApplication
public class AtvApplication {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}
