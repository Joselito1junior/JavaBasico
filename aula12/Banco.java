package br.unipe.java.aula12;

public class Banco {
	public void deposito() {
		System.out.println("Deposito");
	}
	
	public void saque() throws NullPointerException {
		System.out.println("Saque");
	}
	
	public void transferencia() throws Exception {
		System.out.println("Transferencia");
	} 
}