/**
 * Authon: Joselito Junior
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class PacienteClinica {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int qtd = 100;
		
		String nome[] = new String[qtd];
		String sexo[] = new String[qtd];
		float peso[] = new float[qtd];
		float altura[] = new float[qtd];
		int idade[] = new int[qtd];
		int qtd_pacientes = 0;
		float idade_media = 0;//idade média dos homens
		int mulher_acima_peso = 0;
		int qtd_jovens = 0;
		int indice_mais_velho = 0; //indica o indice que contem a idade do paciente mais velho
		float idade_mais_velho = 0;////guarda o valor da idade do paciente mais velho
		float altura_mais_baixa = 10; //indica o valor da menor altura
		int indice_mais_baixa = 0;////guarda o indice da menor altura
		boolean ha_mulher = false;	
		int qtd_homens = 0;
		
		for(int i = 0; i < 100; i++, qtd_pacientes++)
		{
			System.out.println("Digite o nome do(a) paciente: ");
			nome[i] = leitor.next();
			
			if(nome[i].equalsIgnoreCase("fim"))
			{
				i = 100;
				qtd_pacientes--;
				continue;
			}
			else
			{
				System.out.println("Digite M para sexo masculino e F para sexo feminino:");
				sexo[i] = leitor.next();
				if(sexo[i].equalsIgnoreCase("F"))ha_mulher = true;
				
				System.out.println("Digite o peso do(a) paciente: ");
				peso[i] = leitor.nextFloat();
				
				System.out.println("Digite a idade do(a) paciente: ");
				idade[i] = leitor.nextInt();
				
				System.out.println("Digite a altura do(a) paciente: ");
				altura[i] = leitor.nextFloat();	
			}
			
		}
	
		//Quantidade de pacientes
		if(qtd_pacientes  > 1) System.out.println("Foram cadastrados " + qtd_pacientes + " pacientes");
		else System.out.println("Foi cadastrado apenas " + qtd_pacientes + " paciente");
		
		//Idade média dos homens
		for(int i = 0; i < qtd_pacientes; i++)
		{
			if(sexo[i].equalsIgnoreCase("M"))
			{
				idade_media += idade[i];
				qtd_homens++;
			}
		}
		System.out.println("A média de idade dos homens é de: " + idade_media / qtd_homens); 
		
		
		//Quantidade de pessoas com idade entre 18 e 25.
		for(int i = 0; i < qtd_pacientes; i++)
		{
			if((idade[i] > 17) && (idade[i] < 26))
			{
				qtd_jovens++;
			}
		}
		System.out.println("Há " + qtd_jovens + " pessoas entre 18 e 25 anos");
		
		
		//O nome do paciente mais velho.
		for(int i = 0; i < qtd_pacientes; i++)
		{
			if(idade[i] > idade_mais_velho)
			{
				idade_mais_velho = idade[i];
				indice_mais_velho = i;
			}
		}
		System.out.println("O paciente mais velho(a) é " + nome[indice_mais_velho]);
		
		if(ha_mulher)
		{
			//Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
			for(int i = 0; i < qtd_pacientes; i++)
			{
				if(sexo[i].equalsIgnoreCase("F"))
				{
					if((altura[i] > 1.60) && (altura[i] < 1.70))
					{
						if(peso[i] > 70)
						{
							mulher_acima_peso++;
						}
					}
				}
			}
			System.out.println("Há " + mulher_acima_peso + " mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg");
			
			//Nome da mulher mais baixa.
			for(int i = 0; i < qtd_pacientes; i++)
			{
				if(sexo[i].equalsIgnoreCase("F"))
				{
					if(altura[i] < altura_mais_baixa)
					{
						altura_mais_baixa = altura[i];
						indice_mais_baixa = i;
					}
				}
			}
			System.out.println("A mulher mais baixinha é " + nome[indice_mais_baixa]);
		}
		else
		{
			System.out.println("Não há mulheres na lista");
		}
	}	
}
