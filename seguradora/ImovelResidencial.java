package br.unipe.java.seguradora;

	public class ImovelResidencial extends ImovelBasico{
	private char zona; //u - urbana / s - suburbana / r - rural
	private char tipo; //c - casa / a - apartamento		
	PessoaFisica cliente = new PessoaFisica();
	private SeguroResidencial seguro = new SeguroResidencial();
	
	
	
	public SeguroResidencial getSeguro() {
		return seguro;
	}
	public void setSeguro(SeguroResidencial seguro) {
		this.seguro = seguro;
	}
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