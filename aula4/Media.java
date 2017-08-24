/**
 * Author: Joselito Junior
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int i = 1;
		float nota1, nota2, media;
		int reprovados = 0, aprovados = 0, exame = 0;
		float media_classe = 0;

		for(i = 1; i < 7; i++)
		{
			System.out.print("Digite a primeira nota do " + i + "º aluno: ");	
			nota1 = leitor.nextFloat();

			System.out.print("Digite a segunda nota do " + i + "º aluno: ");	
			nota2 = leitor.nextFloat();
			
			media = (nota1 + nota2) / 2;
			media_classe += media;
			
			if(media < 4) {
				System.out.println("Reprovado");
				reprovados++;
			}
			if(media >= 4 && media < 7) {
				System.out.println("Exame");
				exame++;
			}
			if(media >= 7) {
				System.out.println("Aprovado");
				aprovados++;
			}					
		}	
		
		System.out.println(reprovados + " ficaram reprovados");
		System.out.println(exame + " ficaram em exame");
		System.out.println(aprovados + " foram aprovados");
		
		media_classe /= 6;
		System.out.println("A média da classe é: " + media_classe);
		
		leitor.close();
	}
}
