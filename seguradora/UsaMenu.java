package br.unipe.java.seguradora;

import java.util.Scanner;

public class UsaMenu {
	public static void main(String[] args) {
		
		int opcao;
		
		Scanner leitor = new Scanner(System.in);
		
		MenuPrincipal menu = new MenuPrincipal();
		
		do
		{
			System.out.println("----------------------");
			System.out.println("SEGURADORA ARUBA 22");
			System.out.println("----------------------");
			menu.exibeMenu();
			
			System.out.print("Escolha uma op��o: ");
			opcao = leitor.nextInt();
			
		}while(opcao != 8);
		System.out.println("Voc� Saiu! At� mais.");
	}
}
