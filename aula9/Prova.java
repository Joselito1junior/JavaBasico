package br.unipe.java.aula9;

public class Prova {
	
	private float nota;
	private byte peso;
	
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public byte getPeso() {
		return peso;
	}

	public void setPeso(byte peso) {
		this.peso = peso;
	}
	
	public float getNotaPonderada() {
		return this.nota * (this.peso);
	}
}
