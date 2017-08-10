/**
 * Código desenvolvido na sala
 * Adaptei apenas o if / else
 */
package br.unipe.java.aulaum;

import java.util.Scanner;

public class LendoDados {
	
	public static void main(String[] args) {
		
		String nome;
		int anoNascimento;
		int idade;
		
		Scanner leitor = new Scanner(System.in);// faz a importação do scanner para ler a entrada de dados
		
		System.out.println("Digite seu nome:"); //digit syso -> press ctrl + Space
		nome = leitor.nextLine();
		
		System.out.println("Informe o ano de nascimento:");
		anoNascimento = leitor.nextInt();
		
		idade = 2017 - anoNascimento;
		System.out.println("Ola " + nome + "!");
		
		if(idade <= 1) System.out.println("Sua idade é: " + idade + " ano");
		else System.out.println("Sua idade é: " + idade + " anos");
	}
}