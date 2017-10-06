package br.unipe.java.seguradora;

public class PessoaFisica extends ClienteBasico{
	private String CPF;
	
	/*PessoaFisica(String cpf) {
		this.CPF = cpf;
	}*/
	
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
