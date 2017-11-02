package br.unipe.java.aula16;

import java.io.File;

public class ArquivoSimples {
	public static void main(String[] args) {
		File src = new File (".."+File.separator+"ok",  "AulaJava.java");
		System.out.println("src.getName() = " + src.getName());
		System.out.println("src.isFile() = "+ src.isFile());
		
		
	}
}
