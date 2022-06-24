package com.java.atv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.atv.io.Entrada;
import com.java.atv.modelo.Empresa;
import com.java.atv.negocio.Cadastro;
import com.java.atv.negocio.CadastroCliente;
import com.java.atv.negocio.CadastroProduto;
import com.java.atv.negocio.CadastroServico;
import com.java.atv.negocio.Edicao;
import com.java.atv.negocio.EdicaoCliente;
import com.java.atv.negocio.EdicaoProduto;
import com.java.atv.negocio.EdicaoServico;
import com.java.atv.negocio.Listagem;
import com.java.atv.negocio.ListarClientesAmbosGeneros;
import com.java.atv.negocio.ListarClientesFemininos;
import com.java.atv.negocio.ListarClientesMasculinos;
import com.java.atv.negocio.ListarTodosClientes;
import com.java.atv.negocio.ListarTodosProdutos;
import com.java.atv.negocio.ListarTodosServicos;
import com.java.atv.negocio.RemocaoCliente;
import com.java.atv.negocio.RemocaoProduto;
import com.java.atv.negocio.RemocaoServico;

@SpringBootApplication
public class AtvApplication {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao sistema de cadastro do Grupo World Beauty!");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Editar");
			System.out.println("4 - Remover");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();
			
			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("-----------------------");
				System.out.println("Até mais!");
				break;
			case 1:
				System.out.println("-----------------------");
				System.out.println("O que deseja cadastrar?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 0:
					break;
				case 1:
					Cadastro cadastro = new CadastroCliente(empresa.getClientes());
					cadastro.cadastrar();
					break;
				case 2:
					cadastro = new CadastroProduto();
					cadastro.cadastrar();
					break;
				case 3:
					cadastro = new CadastroServico(empresa.getServicos());
					cadastro.cadastrar();
					break;
				}
				break;
			case 2:
				System.out.println("-----------------------");
				System.out.println("O que deseja listar?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 1:
					System.out.println("-----------------------");
					System.out.println("Que lista de clientes deseja visualizar?");
					System.out.println("1 - Todos os clientes");
					System.out.println("2 - Clientes femininos");
					System.out.println("3 - Clientes masculinos");
					System.out.println("4 - Clientes listados por gênero");
					System.out.println("0 - Voltar");
					
					operacao = entrada.receberNumeroInteiro();
					
					switch(operacao) {
					case 0:
						break;
					case 1:
						Listagem listagem = new ListarTodosClientes(empresa.getClientes());
						listagem.listar();
						break;
					case 2:
						listagem = new ListarClientesFemininos(empresa.getClientes());
						listagem.listar();
						break;
					case 3:
						listagem = new ListarClientesMasculinos(empresa.getClientes());
						listagem.listar();
						break;
					case 4:
						listagem = new ListarClientesAmbosGeneros(empresa.getClientes());
						listagem.listar();
						break;
					}
					break;
				case 2:
					Listagem listagem = new ListarTodosProdutos(empresa.getProdutos());
					listagem.listar();
					break;
				case 3:
					listagem = new ListarTodosServicos(empresa.getServicos());
					listagem.listar();
					break;
				}
				break;
			case 3:
				System.out.println("-----------------------");
				System.out.println("O que deseja editar?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 0:
					break;
				case 1:
					Edicao editar = new EdicaoCliente(empresa.getClientes());
					editar.editar();
					break;
				case 2:
					editar = new EdicaoServico(empresa.getServicos());
					editar.editar();
					break;
				case 3:
					editar = new EdicaoServico(empresa.getServicos());
					editar.editar();
					break;
				default:
					System.out.println("Operação não assimilada");
				}
				break;
			case 4:
				System.out.println("-----------------------");
				System.out.println("O que deseja remover?");
				System.out.println("1 - Cliente");
				System.out.println("2 - Produto");
				System.out.println("3 - Serviço");
				System.out.println("0 - Voltar");
				
				operacao = entrada.receberNumeroInteiro();
				
				switch(operacao) {
				case 0:
					break;
				case 1:
					Edicao editar = new RemocaoCliente(empresa.getClientes());
					editar.editar();
					break;
				case 2:
					editar = new RemocaoProduto(empresa.getProdutos());
					editar.editar();
					break;
				case 3:
					editar = new RemocaoServico(empresa.getServicos());
					editar.editar();
					break;
				}
				break;
			default:
				System.out.println("Operação não assimilada");
			}
		}
	}
}
