package br.unipe.java.aula6;

public class Cliente {

	private String nome;
	private String endereco;
	
	public Cliente(String umNome, String umEnd)
	{
		nome = umNome;
		endereco = umEnd;
	}
	
	public Cliente(String umNome, String j)
	{
		nome = umNome;
	}
	
	public Cliente()
	{
	}
}