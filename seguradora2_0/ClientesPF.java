package br.unipe.java.seguradora2_0;

import java.util.Scanner;

public class ClientesPF extends Clientes{

	Scanner leitor = new Scanner(System.in);
	
	private byte tipo;
	
	public byte getTipo() {
		return tipo;
	}
	
	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}

	public void cadastraCliPF() {
		/*
		System.out.print("Digite o nome do cliente: ");
		setNome(leitor.next());
		System.out.print("Digite o CEP do im�vel: ");
		setCep(leitor.next());
		System.out.print("Digite o numero do im�vel: ");
		setNumero(leitor.nextInt());
		System.out.print("Digite a zona em que voc� mora\n1 - Urbana\n2 - Sub.Urb\n3 - Rural\nDigite uma op��o: ");
		setZona(leitor.nextByte());
		System.out.print("Digite o valor do Imovel: ");
		setValor(leitor.nextFloat());
		
		System.out.print("Digite o tipo\n1 - Apartamento\n2 - Casa\nDigite sua opcao: ");
		setTipo(leitor.nextByte());
		*/
	}
}
