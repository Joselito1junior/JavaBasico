package br.unipe.java.seguradora;

public class ClienteBasico {
	private String nome;
	private char sexo;
	private byte idade;
	private int telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
