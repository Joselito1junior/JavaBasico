package br.unipe.java.aula9;

import java.util.Scanner;

public class CalculoMedia {
	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Scanner leitor = new Scanner(System.in);
		Prova provaUm = new Prova();
		Prova provaDois = new Prova();
		
		System.out.print("Informe a nota da prova 1: ");
		provaUm.setNota(leitor.nextFloat());
		System.out.print("Informe o peso da prova 1: ");
		provaUm.setPeso(leitor.nextByte());
		
		System.out.print("Informe a nota da prova 2: ");
		provaDois.setNota(leitor.nextFloat());
		System.out.print("Informe o peso da prova 2: ");
		provaDois.setPeso(leitor.nextByte());
		
		a.setProvaUm(provaUm);
		a.setProvaDois(provaDois);
		
		System.out.println(a.getMediaAluno());
		leitor.close();
	}
}