package br.unipe.java.aula14;

public class Funcionario extends Pessoa{

	private String matricula;
	
	public void imprimeNome() {
		System.out.println(this.matricula + "Nome: " + getNome());
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, byte idade, Perfil perfil) {
		super(nome, idade, perfil);
	}
	
	protected void finalize() {
		super.finalize();
	}
}