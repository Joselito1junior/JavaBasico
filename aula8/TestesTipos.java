package br.unipe.java.aula8;

public class TestesTipos {
	
	public static final int x = 5;
	
	public static void main(String[] args) {
		
		byte variavelByte = 127;
		short variavelShort = 12852;
		int variavelInt;
		long variavelLong;
		
		float variavelFloat;
		double variavelDouble;
		char variavelChar;
		boolean variavelBoolean;
		
		byte byteTeste = (byte)variavelShort;
		System.out.println(byteTeste);
		
		String valor = "28";
		final int numero = Integer.parseInt(valor);
		System.out.println(numero);
		
		System.out.println(x);
		
		x = 10;
	}
}
