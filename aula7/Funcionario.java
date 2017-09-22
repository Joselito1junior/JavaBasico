package br.unipe.java.aula7;

public class Funcionario extends Pessoa{

	private String cargo;
	private String setor;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

}