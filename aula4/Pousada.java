/**
 * Author: Joselito Junior
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class Pousada {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);	
		
		String nome;
		int dias = 0;
		int taxa1 = 15;
		int taxa2 = 8;
		int total_cliente = 0;
		int arrecadacao = 0;
		
		while(true)
		{
			System.out.print("Digite seu nome: ");
			nome = leitor.next();
			
			System.out.print("Digite a quantidade de dias: ");
			dias = leitor.nextInt();
			
			if(dias < 10)
			{
				total_cliente = (dias * taxa1) + dias * 40;
				arrecadacao += total_cliente;
				System.out.println("O cliente "+ nome +" deve pagar R$" + total_cliente);
			}
			else
			{
				total_cliente = (dias * taxa2) + dias * 40;
				arrecadacao += total_cliente;
				System.out.println("O cliente ["+ nome +"] deve pagar R$" + total_cliente);		
			}
			
			System.out.println("O hotel arrecadou " + arrecadacao);
			System.out.println("");
		}
	}
}
