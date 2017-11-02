package br.unipe.java.seguradora2_0;

import java.util.ArrayList;

public class Clientes {
	private String cep;
	private int numero;
	private float valor;
	private String nome;
	private byte zona;
	private float seguro;
	
	public float getSeguro() {
		return seguro;
	}
	public void setSeguro(float seguro) {
		this.seguro = seguro;
	}
	private ArrayList<Integer> sinistro = new ArrayList <>();
	
	public void addSinistro(int ocorrencia){
		this.sinistro.add(ocorrencia);
	}
	public byte getZona() {
		return zona;
	}
	public void setZona(byte zona) {
		this.zona = zona;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
