/**
 * Author: Joselito Junior
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class AjusteSalario {
	public static void main(String[] args)  {
		
		Scanner leitor = new Scanner(System.in);

		String nome;
		float salario;
		int sair = 0;
		
		while(sair == 0)
		{
			System.out.print("Digite seu nome: ");
			nome = leitor.next();
			
			if(nome.equalsIgnoreCase("fim"))
			{
				sair = 1;
				System.out.println("Seu programa foi finalizado");
			}
			else
			{
				System.out.print("Digite seu salario: ");
				salario = leitor.nextFloat();
				
				if(salario < 500)
				{	
					float novo_salario;
					novo_salario = (salario + (salario * 20/100)) ;
					System.out.println("Oi " + nome + " seu salario é R$" + salario + " e vai para R$" + novo_salario);
				}
				else
				{
					System.out.println(nome + " você já ganha bem demais, não vai ter aumento!");
				}
			}
		}
		leitor.close();
	}
}
