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
		
		System.out.print("Digite o nome do cliente: ");
		setNome(leitor.next());
		System.out.print("Digite o CEP do imóvel: ");
		setCep(leitor.next());
		System.out.print("Digite o numero do imóvel: ");
		setNumero(leitor.nextInt());
		System.out.print("Digite a zona em que sua empresa está situada\n1 - Urbana\n2 - Sub.Urb\n3 - Rural\nDigite uma opção: ");
		setZona(leitor.nextByte());
		System.out.print("Digite o valor do Imovel: ");
		setValor(leitor.nextFloat());
		
		System.out.print("Digite o numero de funcionarios de sua empresa: ");
		setNumFuncionarios(leitor.nextInt());
		System.out.print("Digite o numero de visitas diária: ");
		setNumVisitasDia(leitor.nextInt());
		System.out.print("Digite o ramo de atuação:\n1 - Industria\n2 - Comercio\n3 - Agropecuaria\nDigite uma opção: ");
		setRamo(leitor.nextByte());	
	
	
	float calculoSeguroPJ;
	
	float valor = getValor();
	float valorUsado = (valor*4)/100;
	
	int numFuncionarios = (int) getNumFuncionarios();
	int numFuncionariosUsado = numFuncionarios/10; 
	
	int numVisitas = (int) getNumVisitasDia();
	int numVisitasUsada = numVisitas/200;
	
	byte ramo = getRamo();
	
	
	if(ramo==1) {
		
		double calculaSeguroPJ = valorUsado+(0.002*numFuncionariosUsado)+(numVisitasUsada*0.003)+valor*0.01;
		calculoSeguroPJ = (float) calculaSeguroPJ;
		setSeguro(calculoSeguroPJ);

	}else if(ramo==2) {
		
		double calculaSeguroPJ = valorUsado+(0.003*numFuncionariosUsado)+(numVisitasUsada*0.003)+valor*0.005;
		calculoSeguroPJ = (float) calculaSeguroPJ;
		setSeguro(calculoSeguroPJ);

	}else if(ramo==3) {
		
		double calculaSeguroPJ = valorUsado+(0.003*numFuncionariosUsado)+(numVisitasUsada*0.003);
		calculoSeguroPJ = (float) calculaSeguroPJ;
		setSeguro(calculoSeguroPJ);

	}else
		System.out.println("Não foi possível fazer o calculo do seguro, por valores inválidos.");
	
}}
