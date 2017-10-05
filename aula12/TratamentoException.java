package br.unipe.java.aula12;



import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoException {
	public static void main(String[] args) {
		
		Scanner Leitor = new Scanner(System.in);
				
		System.out.println("Digite uma opção: ");
		System.out.println("1 - Continuar");
		System.out.println("2 - Sair");
		
		Banco banco = new Banco();
		
		banco.transferencia(); //Apresenta um erro devido a falta de tratamento de exceção
		
		try {
			int opcao = Leitor.nextInt();
			if(opcao == 1)
			{
				System.out.println("Continuar");
			}
			else 
			{
				System.exit(0);
				System.out.println("Programa saindo");
			}
			System.out.println("Programa executado");
			
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Digite um numero");			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Vossa senhoria é um Jumento!");
		}


	}
}
