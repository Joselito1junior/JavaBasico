package br.unipe.java.aula2;

public class Professor  //Classe 
{
	String disciplina; //Atributo
	/**
	 * Esse metodo ensina alguma disiplina.
	 */
	public void ensina()//Método - Compotamento
	{
		System.out.println("O professor ensina a disciplina de " + this.disciplina);
	}
}