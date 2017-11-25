package br.unipe.java.aula17;

public abstract class Personagem {
	Arma_IF arma;
	
	public abstract void desenhar();
	
	public void fala() {
		System.out.println("Grhh");
	}
	
	public void arma()
	{
		System.out.println("Tra tra tra");
		arma.usaArma();
	}
	
	public void setArma(Arma_IF a)
	{
		arma = a;		
	}
}
