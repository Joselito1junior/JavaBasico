package br.unipe.java.aula16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ArquivoDados {
	public static void main(String[] args) {
		
		InputStream in;
		
		try {
			in = new FileInputStream("AulaJava.txt");
			int total = 0;
			
			while(in.read()!= -1) {
				total++;
			}
			System.out.println(total + "bytes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
