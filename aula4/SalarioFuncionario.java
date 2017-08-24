/**
 * Author: Abner Souza
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class SalarioFuncionario {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		float salario;
		float porcentagem;
		float novosalario;
		
		System.out.println("Informe nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Informe o salário atual: ");
		salario = leitor.nextFloat();
		
		System.out.println("Informe a percentagem de aumento: ");
		porcentagem = leitor.nextFloat();
		novosalario = salario+(salario*(porcentagem/100));
		
		System.out.println(nome+", o seu novo salário é de R$"+novosalario+"0 com base num aumento de "+porcentagem+"%");

	}
}
