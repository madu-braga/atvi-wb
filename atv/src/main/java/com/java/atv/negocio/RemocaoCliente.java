package com.java.atv.negocio;

import java.util.List;

import com.java.atv.io.Entrada;
import com.java.atv.modelo.Cliente;

public class RemocaoCliente extends Edicao {
	private List<Cliente> clientes;
	private Entrada entrada;
	
	public RemocaoCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	@Override
	public void editar() {
		
		System.out.println("======================================");
		System.out.println("Identifique o cliente utilizando o CPF:");
		Entrada entrada = new Entrada();
		String cpf = entrada.receberTexto();

		for(int i = 0; i< clientes.size(); i++) {
			Cliente c = clientes.get(i);
			if(c.getCpf().getValor().equals(cpf)) {
				clientes.remove(c);
				break;
			}
		}
	}

}
