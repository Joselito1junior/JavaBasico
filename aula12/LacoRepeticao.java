package br.unipe.java.aula12;

public class LacoRepeticao {
	public static void main(String[] args) {
		int contador = 0;
		int contadorForv = 100;
		
		while(contador < 100) {
			for(;contadorForv > 0;) {
				--contadorForv;
				System.out.println(contadorForv);
				break;
			}		
			contadorForv = 100;
			System.out.println(contador);
			contador++;
		}
	}
}
