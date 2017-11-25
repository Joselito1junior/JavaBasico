package br.unipe.java.teatro.modelo;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		String nome;
		String cpf;
		int posicao;
		Teatro teatro = new Teatro();
		
		
		Menu menu = new Menu();
		Cadeira cadeira;

		Scanner leitor = new Scanner(System.in);

		while (true) {

			menu.exibeMenu();
			int opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
					
					break;
			
			case 3:	teatro.listarCadeirasVazias();
					break;
			
			case 4:	teatro.listarCadeirasOcupadas();
					break;
				
			case 5:	System.out.println("Programa Encerrando");
					System.exit(0);
					break;
			default:
				break;
			}

		}

	}

}
