package br.unipe.java.aula11;

public class PetShop {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cachorro pastor = new Cachorro();
		Rato rato = new Rato();
		
		pastor.setNome("Nome");
		pastor.setPeso(100);
		rato.setPeso(peso);
		
		animal = pastor; //Polimorfismo
	}
}
