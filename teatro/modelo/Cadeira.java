package br.unipe.java.teatro.modelo;

public class Cadeira {
	
	private int posicao;
	private Usuario usuario;
	
	
	public Cadeira(int posicao, Usuario usuario) {
		super();
		this.posicao = posicao;
		this.usuario = usuario;
	}
	
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String toString() {
		return "Cadeira [posicao=" + posicao + ", usuario=" + this.usuario + "]";
	}


	
}
