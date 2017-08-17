package br.unipe.java.aula3;

import java.util.Scanner;

public class SomaSimples {
	public static void main(String[] args) {
		float valor1 = 0;
		float valor2 = 0;
		float result = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		valor1 = leitor.nextFloat();
		System.out.println("Digite o segundo valor:");
		valor2 = leitor.nextFloat();
		
		result = valor1 + valor2;
		System.out.println("O valor da soma é: "+ result);
		
	}
}
