/**
 * Author: Abner Souza
 */
package br.unipe.java.aula4;

import java.util.Scanner;

public class PostoGasolina {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		double litroGasolina;
		double qtdRefri;
		double total;
		
		System.out.println("Informe seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Informe quantos litros você precisou para abastecer: ");
		litroGasolina = leitor.nextFloat();
		
		System.out.println("Informe quantos refrigerantes:");
		qtdRefri = leitor.nextFloat();
		total = litroGasolina*2.5+qtdRefri*3;
		
		System.out.println(nome+", você terá que pagar R$"+total+" pela compra de "+qtdRefri+" refrigerantes e "+litroGasolina+" litros de gasolina, com o preço de R$3,00 e R$2,50 respectivamente.");
	}
}
