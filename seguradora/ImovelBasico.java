package br.unipe.java.seguradora;

public class ImovelBasico{
	
	private byte qtdComodos;
	private String endereco;
	private float valorImovel;
	
	public byte getQtdComodos() {
		return qtdComodos;
	}
	public void setQtdComodos(byte qtdComodos) {
		this.qtdComodos = qtdComodos;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel(float valorImovel) {
		this.valorImovel = valorImovel;
	}
}
