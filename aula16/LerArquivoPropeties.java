package br.unipe.java.aula16;

import java.io.FileInputStream;
import java.util.Map.Entry;
import java.util.Properties;

public class LerArquivoPropeties{
	public static void main(String[] args) throws Exception {
		
		Properties propeties = new Properties();
		
		propeties.load(new FileInputStream("configuracao.properties"));
		
		System.out.println(propeties.getProperty("host"));
		
		for(Entry<Object, Object> e: propeties.entrySet()) {
			System.out.printf("%s->%s%n", e.getKey(), e.getValue());
		}
	}

}
