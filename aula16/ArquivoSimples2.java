package br.unipe.java.aula16;

import java.io.File;
import java.io.IOException;

public class ArquivoSimples2 {
	public static void main(String[] args) {
		
		File src = new File ("AulaJava.txt");
		
		File dir = new File ("pasta/outra-pasta/e-pasta");
		
		dir.mkdirs();
		
		try {
			boolean criado = src.createNewFile();
			
			if(criado)
				System.out.println("Criado em: "+ src.getAbsolutePath());
			else
				System.out.println("Arquivo não criado");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("src.getName() = " + src.getName());
		System.out.println("src.isFile() = "+ src.isFile());
		
	}
}
