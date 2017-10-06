package br.unipe.java.seguradora;

import java.util.Scanner;

public class UsaMenu {
	public static void main(String[] args) {
						
		MenuPrincipal menu = new MenuPrincipal();
		int opcao;
		Scanner leitor = new Scanner(System.in);
		
		do
		{
			opcao = menu.exibeMenu();
			
			switch(opcao)
			{
				case 1: UsaCliente cliente = new UsaCliente();
						int clienteTipo = cliente.tipoCliente();
						
						if(clienteTipo == 1)
						{			
							ImovelResidencial clientePf = new ImovelResidencial();
							PessoaFisica perfil = new PessoaFisica();
							
							System.out.print("Digite seu nome: ");
							perfil.setNome(leitor.nextLine());
							System.out.print("Digite sua idade: ");
							perfil.setIdade(leitor.nextByte());		
							System.out.print("Digite um telefone: ");
							perfil.setTelefone(leitor.nextLong());								
							System.out.print("Digite seu CPF (hahaha): ");
							perfil.setCPF(leitor.nextLine());
							
							System.out.print("Qual a zona do imovel (Urbana/Rural/Suburbana): ");
							clientePf.setZona(leitor.nextLine());
							System.out.print("Qual o tipo de habitação(Casa/Apartamento): ");
							clientePf.setTipo(leitor.nextLine());
							System.out.print("Qual o endereço(Rua/Bairro/Estado/Numero)");
							clientePf.setEndereco(leitor.nextLine());
							System.out.print("Qual a quantidade de comodos do imovel: ");
							clientePf.setQtdComodos(leitor.nextByte());
							System.out.print("Qual o valor do Imovel: ");
							clientePf.setValorImovel(leitor.nextFloat());
							
							clientePf.setCliente(perfil);							
							cliente.listaClientes(clientePf);
							
						}
						else if(clienteTipo == 2)
						{
							
						}
						else
						{
							
						}
						break;
					}
			
		}while(opcao != 8);
		
		leitor.close();
		System.out.println("Você Saiu! Até mais.");
	}
}