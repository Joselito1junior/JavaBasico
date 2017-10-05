package br.unipe.java.seguradora;

public class ImovelResidencial extends ImovelBasico{
	char zona; //u - urbana / s - suburbana / r - rural
	char tipo; //c - casa / a - apartamento		
	
	PessoaFisica cliente = new PessoaFisica();
	
	public char getZona() {
		return zona;
	}
	public void setZona(char zona) {
		this.zona = zona;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public PessoaFisica getCliente() {
		return cliente;
	}
	public void setCliente(PessoaFisica cliente) {
		this.cliente = cliente;
	}
}