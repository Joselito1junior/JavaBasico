/**
 * Author: Otiniel Dias
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class ImparOuPar {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int n=100;
		int numero[] = new int[n];
		int i;
		
		//leitura de dados por indice do vetor
		for(i=0;i<10;++i){
			System.out.println("Digite o número: ");
			numero[i] = ler.nextInt();
		}
		
		//processamento e saida
			for(i=0;i<10;++i){
				if (numero[i] % 2 == 0){
					System.out.printf("O numero %d é par\n", numero[i]);
				}
				else{
					System.out.printf("O numero %d é impar\n", numero[i]);
				}
			}
		}
}
