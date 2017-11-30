package br.unipe.java.teatro.modelo;

import java.util.Scanner;

public class ProgramaPrincipal {
	
public static void main(String[] args) {
		
		String nome;
		String cpf;
		int posicao;
		Teatro teatro = new Teatro();
		Usuario user;
		Menu menu = new Menu();
		Cadeira cadeira;

		Scanner leitor = new Scanner(System.in);

		while (true) {

			menu.exibeMenu();
			int opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
				user = new Usuario("nome", "cpf");
				teatro.listarCadeirasVazias();
				System.out.println("Informe em qual cadeira quer ocupar: ");
				posicao = leitor.nextInt();
				try {
				cadeira= new Cadeira (posicao, user);
				System.out.println(cadeira.toString());
				teatro.ocupar(cadeira);
				}catch (Exception e){
					System.out.println("Não foi possível ocupar a cadeira");
				}
				
					break;
				
			case 2:
				teatro.listarCadeirasOcupadas();
				System.out.println("Informe qual lugar deseja desocupar: ");
				posicao = leitor.nextInt();
				teatro.desocupar(posicao);
				
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
