package br.unipe.java.seguradora;

import java.util.Scanner;

public class UsaMenu {
	public static void main(String[] args) {
						
		MenuPrincipal menu = new MenuPrincipal();
		int opcao;
		Scanner leitor = new Scanner(System.in);
		ImovelResidencial[] clientePf = new ImovelResidencial[10000];//Array que guarda todas as pessoas fisicas
		int clienteIndex = 0;
		
		do
		{
			opcao = menu.exibeMenu();
			
			switch(opcao)
			{
				case 1: UsaCliente cliente = new UsaCliente();
						int clienteTipo = cliente.tipoCliente();
						
						if(clienteTipo == 1)
						{			
							PessoaFisica perfil = new PessoaFisica();
							ImovelResidencial pessoaFisica = new ImovelResidencial(); 
							
							System.out.print("Digite seu nome: ");
							perfil.setNome(leitor.nextLine());
							System.out.print("Digite sua idade: ");
							perfil.setIdade(leitor.nextByte());		
							System.out.print("Digite um telefone: ");
							perfil.setTelefone(leitor.nextLong());		
							System.out.print("Digite seu CPF: ");
							perfil.setCPF(leitor.nextLong());
							
							System.out.print("Qual a zona do imovel (Urbana/Rural/Suburbana): ");
							pessoaFisica.setZona(leitor.next());
							System.out.print("Qual o tipo de habitação(Casa/Apartamento): ");
							pessoaFisica.setTipo(leitor.next());
							System.out.print("Qual o endereço(Ex: Rua, Bairro, Cidade-ES, Numero)");
							pessoaFisica.setEndereco(leitor.next());
							System.out.print("Qual a quantidade de comodos de imovel: ");
							pessoaFisica.setQtdComodos(leitor.nextByte());
							System.out.print("Qual o valor do Imovel: ");
							pessoaFisica.setValorImovel(leitor.nextFloat());
							
							pessoaFisica.setCliente(perfil);							
							clientePf[clienteIndex] = pessoaFisica;
							clienteIndex++;
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