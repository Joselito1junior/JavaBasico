package br.unipe.java.seguradora2_0;

import java.util.Scanner;

public class ClientesPJ extends Clientes{
	
	Scanner leitor = new Scanner(System.in);
	
	private int numFuncionarios;
	private int numVisitasDia;
	private byte ramo;
	
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	public int getNumVisitasDia() {
		return numVisitasDia;
	}
	public void setNumVisitasDia(int numVisitasDia) {
		this.numVisitasDia = numVisitasDia;
	}
	public byte getRamo() {
		return ramo;
	}
	public void setRamo(byte ramo) {
		this.ramo = ramo;
	}
	
	public void cadastraCliPJ() {
		/*
		System.out.print("Digite o nome do cliente: ");
		setNome(leitor.next());
		System.out.print("Digite o CEP do im�vel: ");
		setCep(leitor.next());
		System.out.print("Digite o numero do im�vel: ");
		setNumero(leitor.nextInt());
		System.out.print("Digite a zona em que sua empresa est� situada\n1 - Urbana\n2 - Sub.Urb\n3 - Rural\nDigite uma op��o: ");
		setZona(leitor.nextByte());
		System.out.print("Digite o valor do Imovel: ");
		setValor(leitor.nextFloat());
		
		System.out.print("Digite o numero de funcionarios de sua empresa: ");
		setNumFuncionarios(leitor.nextInt());
		System.out.print("Digite o numero de visitas di�ria: ");
		setNumVisitasDia(leitor.nextInt());
		System.out.print("Digite o ramo de atua��o\n1 - Com�rcio\n2 - Industria\n3 - Agropecuaria\nDigite uma op��o: ");
		setRamo(leitor.nextByte());
		*/
	}
	
}
