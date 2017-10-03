package br.unipe.java.aula11;

public class Animal {
	
	private String especie;
	private String nome;
	private char sexo;
	private double peso;
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso > 0)
		{
			System.out.println(peso);
			this.peso = peso;
		}
		else
		{
			System.out.println("Valor inválido e setado em 0");
			this.peso = 0;
		}
			
		
	}
	
	

}
