package br.unipe.java.aula3;

import java.util.Scanner;

import br.unipe.java.aula2.Cachorro;

public class UsaCerveja {
	public static void main(String[] args) {
		
		int cervejas = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de cervejas");
		cervejas = leitor.nextInt();
		
		while(cervejas > 0)
		{
			System.out.println("Existem " + cervejas + " na freezer...");
			System.out.println("Pego uma cerveja e passo para frente");
			cervejas = cervejas - 1;
			System.out.println("Agora são " + cervejas + " na freezer...");
			if(cervejas == 1)
			{
				System.out.println("Computação Depressão");
			}
		}
		
		leitor.close();
	}
}