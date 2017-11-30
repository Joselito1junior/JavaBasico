package br.unipe.java.teatro.modelo;
import java.util.Scanner;

public class Usuario {
	
	private String nome;
	private String cpf;
	Scanner leitor = new Scanner(System.in);
	
	public Usuario(String nome, String cpf) {
		super();
		System.out.println("Informe seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Informe seu CPF: ");
		cpf = leitor.nextLine();
		
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
