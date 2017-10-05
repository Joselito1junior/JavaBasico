package br.unipe.java.seguradora;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaMenu {
	public static void main(String[] args) {
						
		MenuPrincipal menu = new MenuPrincipal();
		int opcao;
		int numCliente = 0; //Guarda o inidice com o número de clientes cadastrados
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
							
							System.out.println("Digite seu nome:");
							clientePf.setCliente();
							
							

						else if(clienteTipo == 2)
						{
							
						}
						else
						{
							
						}
						break;
			}
			
		}while(opcao != 8);
		System.out.println("Você Saiu! Até mais.");
	}
}

//PessoaFisica clientePf = new PessoaFisica();
/*
 * 	System.out.println("Digite seu nome:");
	clientePf.setNome(leitor.nextLine());
	System.out.println("Digite seu CPF:");
	clientePf.setCPF(leitor.nextLine());
	System.out.println("Digite seu Idade:");
	clientePf.setIdade(leitor.nextByte());
	System.out.println("Digite seu Telefone:");
	clientePf.setTelefone(leitor.nextLong());
*/

//ArrayList<PessoaFisica> pfList = new ArrayList<>(); //lista de pessoas

//pfList.add(new PessoaFisica("3123123"));
//pfList.get(1).

//pfList.add(pf);
//for(PessoaFiscica pf : pfList);
//pfList.get(100);