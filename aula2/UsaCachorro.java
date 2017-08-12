package br.unipe.java.aula2;

import java.util.Scanner;

public class UsaCachorro {
	
	public static void main(String[] args) 
	{	
		Scanner leitor = new Scanner(System.in);// faz a importação do scanner para ler a entrada de dados
		Cachorro cao = new Cachorro();
		
		System.out.println("Informe o nome do cachorro: ");
		cao.nome = leitor.next();
		
		cao.late();
		cao.morde();
		cao.anda();
	}
}