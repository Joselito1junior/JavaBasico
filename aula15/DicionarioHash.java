package br.unipe.java.aula15;

import java.util.HashMap;

public class DicionarioHash {
	public static void main(String[] args) {
		
		HashMap <Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Janeiro");
		System.out.println(mapa.get(1));
		System.out.println(mapa.toString());
	}
}
