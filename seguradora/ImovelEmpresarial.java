package br.unipe.java.seguradora;

public class ImovelEmpresarial {
	private int numFuncionarios;
	private int numVisitasDiarias;
	private char Ramo; //c - comercio / i - industria / a - agropecuaria
	private PessoaJuridica cliente = new PessoaJuridica();
	private SeguroEmpresarial seguro = new SeguroEmpresarial();
	
	public SeguroEmpresarial getSeguro() {
		return seguro;
	}
	public void setSeguro(SeguroEmpresarial seguro) {
		this.seguro = seguro;
	}
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	public int getNumVisitasDiarias() {
		return numVisitasDiarias;
	}
	public void setNumVisitasDiarias(int numVisitasDiarias) {
		this.numVisitasDiarias = numVisitasDiarias;
	}
	public char getRamo() {
		return Ramo;
	}
	public void setRamo(char ramo) {
		Ramo = ramo;
	}
	public PessoaJuridica getCliente() {
		return cliente;
	}
	public void setCliente(PessoaJuridica cliente) {
		this.cliente = cliente;
	}
	
	
}