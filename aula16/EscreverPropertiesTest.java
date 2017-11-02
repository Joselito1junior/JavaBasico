package br.unipe.java.aula16;

import java.io.FileOutputStream;
import java.util.Properties;

public class EscreverPropertiesTest {

	public static void main(String[] args) throws Exception {
		
		Properties propeties = new Properties();
		
		propeties.setProperty("host", "www.google.com.br");
		propeties.setProperty("senha", "oratoroeuaroupadoreideroma");
		propeties.setProperty("usuario", "root");
		
		propeties.store(new FileOutputStream("configuracao.prpeties"), "configuração do banco de dados");
		
		
	}
}
