package br.unipe.java.aula5;

public class UsaObjetoJapones {
	/*
	 * author: Joselito Junior
	 */
	public static void main(String[] args) {
		
		ObjetoJapones variavelReferenciaUm = new ObjetoJapones();
		ObjetoJapones variavelReferenciaDois = new ObjetoJapones();
		ObjetoJapones variavelReferenciaTres;
		
		variavelReferenciaUm.setNomeObjeto("origami");
		variavelReferenciaUm.setMaterialObjeto("Papel");
		
		variavelReferenciaDois.setNomeObjeto("fujioka");
		variavelReferenciaDois.setMaterialObjeto("Arroz");
		
		variavelReferenciaTres = variavelReferenciaUm;
		
		variavelReferenciaTres.setNomeObjeto("OutroObjeto");
		
		System.out.println(variavelReferenciaDois.getNomeObjeto());
	}

}
