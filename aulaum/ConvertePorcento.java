/**
 * Esse c�digo converte a parte fracionada do valor em porcentagem com rela��o ao valor total.
 */
package br.unipe.java.aulaum;

import java.util.Scanner;

public class ConvertePorcento {
	
	public static void main(String[] args) 
	{
		float valorTotal;
		float valorFracionado;
		float porcentagem;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor total: ");
		valorTotal = leitor.nextFloat();
		
		System.out.println("Digite a parte fracionada: ");
		valorFracionado = leitor.nextFloat();
		
		porcentagem = (valorFracionado * 100) / valorTotal; 
		
		System.out.println("Os valores digitados foram " + valorTotal + " e " + valorFracionado);
		System.out.println("-> " + valorFracionado + " representa " + porcentagem + "% do valor total");
	}
}