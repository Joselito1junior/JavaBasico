/**
 * Author: Joselito Junior
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class CreditoPrefeitura {
public static void main(String[] args)  {
		
	Scanner leitor = new Scanner(System.in);
	
	float salario;
	float parcela;
	double parcela_min = 0;
		
	System.out.print("Digite seu salario: ");
	salario = leitor.nextFloat();
	
	System.out.print("Digite a presta��o: ");
	parcela = leitor.nextFloat();
	
	parcela_min = (salario * 30) / 100;
	
	if(parcela < parcela_min)
	{
		System.out.println("Voc� pode fazer o emprestimo");
	}
	else
	{
		System.out.println("Voc� n�o pode fazer o emprestimo");
	}
	
	leitor.close();
	}
}
