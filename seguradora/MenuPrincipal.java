package br.unipe.java.seguradora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
	
	int exibeMenu()
	{
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("SEGURADORA ARUBA 22");
		System.out.println("----------------------");
		System.out.println("[MENU PRINCIPAL]");
		
		System.out.println("1 - CADASTRO DE CLIENTES");
		System.out.println("2 - CADASTRO DE CONTRATOS");
		System.out.println("3 - LISTA DE CLIENTES");
		System.out.println("4 - LISTA DE CONTRATOS");
		System.out.println("5 - CADASTRO DE SINISTRO");
		System.out.println("6 - LISTA DE SINISTRO");
		System.out.println("7 - LISTA DE CONTRATOS SEM SINISTRO");
		System.out.println("8 - SAIR ");
		
		try {
			System.out.print("Escolha uma opção: ");
			opcao = leitor.nextInt();
			//leitor.close();
			return opcao;
		} catch (InputMismatchException e) {
			System.out.println("Digite uma das opções do MENU: ");
			return 0;
		}
	}
}
