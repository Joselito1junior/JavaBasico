package br.unipe.java.aula3;

import java.util.Scanner;

public class IdadeNome {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int idade = 10;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = leitor.next();
		System.out.print("Digite sua idade: ");
		idade = leitor.nextInt();
		
		System.out.println(nome + " você tem " + idade);
	}
}
