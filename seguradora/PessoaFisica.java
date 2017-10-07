package br.unipe.java.seguradora;

public class PessoaFisica extends ClienteBasico{
	
	private long CPF;
	
	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		this.CPF = cPF;
	}
}
