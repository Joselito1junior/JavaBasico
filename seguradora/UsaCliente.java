package br.unipe.java.seguradora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaCliente {
	
	int opcao = 0; 
	Scanner leitor = new Scanner(System.in);
	ImovelResidencial clientePf = new ImovelResidencial();
	
	
	int tipoCliente()
	{
		do {
			int opcao = 0;
			System.out.println("----------------------");
			System.out.println("CADASTRO DE CLIENTES");
			System.out.println("----------------------");
			System.out.println("1 - PESSOA FISICA");
			System.out.println("2 - PESSOA JURIDICA");
			System.out.println("3 - VOLTAR");
			
			try {
				System.out.print("Escolha uma opção: ");
				opcao = leitor.nextInt();
				return opcao;
			} catch (InputMismatchException e) {
				System.out.println("==================");
				System.out.println("[Opcao inválida!] ");
				System.out.println("==================");
				opcao = 0;
				return 0;
			}
			
		}while(opcao < 1 || opcao > 3);
	}
	
	void cadastroClientesPf()
	{
		
	}
	
	void cadastroClientesPj()
	{
		
	}
	
	void listaClientes(ImovelResidencial clientePf)
	{
		System.out.println("Nome: " + clientePf.getCliente().getNome());
		System.out.println("Idade: " + clientePf.getCliente().getIdade());
		System.out.println("Telefone: " + clientePf.getCliente().getTelefone());
		System.out.println("CPF: " + clientePf.getCliente().getCPF());
		System.out.println("Zona: " + clientePf.getZona());
		System.out.println("Tipo: " + clientePf.getTipo());
		System.out.println("Endereço: " + clientePf.getEndereco());
		System.out.println("Qtd. Comodos: " + clientePf.getQtdComodos());
		System.out.println("Valor do Imovel: " + clientePf.getValorImovel());
	}
}
