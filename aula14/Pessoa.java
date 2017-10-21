package br.unipe.java.aula14;

public class Pessoa {

	private String nome;
	private byte idade;
	private Perfil perfil;
	
	public imprimeNome(){
		System.out.println("Nome: " + this.nome);
	}
	
	public Pessoa()
	{
		this("Sem nome", 0, new Perfil());
		System.out.println("Construtor vazio Pessoa");
	}
	
	public Pessoa(String nome) {
		this(nome, 0, new Perfil());
		this.nome = nome;
		System.out.println("Construtor um parametro PESSOA");
	}

	public Pessoa(String nome, byte idade, Perfil perfil) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.perfil = perfil;
		System.out.println("Construtor dois parametros PESSOA");
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
}
