package br.unipe.java.aula14;

public class UsaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Fujioka");
		
		Funcionario f = new Funcionario();
		
		
		System.gc();
	}
}
