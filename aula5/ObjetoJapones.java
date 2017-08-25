package br.unipe.java.aula5;

public class ObjetoJapones {
	
	private String nomeObjeto;
	private String corObjeto;
	private String materialObjeto;
	
	public String getNomeObjeto() {
		return nomeObjeto;
	}
	public void setNomeObjeto(String nomeObjeto) {
		if(nomeObjeto.equalsIgnoreCase("fujioka")) {
			this.nomeObjeto = "nome não permitido";
		}else {
			this.nomeObjeto = nomeObjeto;
		}
	}
	public String getCorObjeto() {
		return corObjeto;
	}
	public void setCorObjeto(String corObjeto) {
		this.corObjeto = corObjeto;
	}
	public String getMaterialObjeto() {
		return materialObjeto;
	}
	public void setMaterialObjeto(String materialObjeto) {
		this.materialObjeto = materialObjeto;
	}
	
}