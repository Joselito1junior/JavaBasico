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
		
		System.out.print("Digite o nome do cliente: ");
		setNome(leitor.next());
		//setNome("João");
		System.out.print("Digite o CEP do imóvel: ");
		setCep(leitor.next());
		//setCep("583325-252");
		System.out.print("Digite o numero do imóvel: ");
		setNumero(leitor.nextInt());
		//setNumero(25);
		System.out.print("Digite a zona em que você mora\n1 - Urbana\n2 - Sub.Urb\n3 - Rural\nDigite uma opção: ");
		setZona(leitor.nextByte());
		//setZona(leitor.nextByte());
		System.out.print("Digite o valor do Imovel: ");
		setValor(leitor.nextFloat());
		//setValor(25000);
		System.out.print("Digite o tipo\n1 - Casa \n2 - Apartamento\nDigite sua opcao: ");
		setTipo(leitor.nextByte());
		//setTipo(leitor.nextByte());
		
		float valor = getValor();
		float calculoSeguroPF = 0;

		
		if(getZona()==1){
			if (getTipo()==1) {
				
				double calculaSeguroPF = valor*0.02+valor*0.01+valor*0.005;
				calculoSeguroPF = (float) calculaSeguroPF;
				setSeguro(calculoSeguroPF);
				
			}
			
		}else if (getZona()==2) {
			
			if (getTipo()==1) {
				
				double calculaSeguroPF = valor*0.02+valor*0.005+valor*0.005;
				calculoSeguroPF = (float) calculaSeguroPF;
				setSeguro(calculoSeguroPF);

				
			}
			
		}else if (getZona()==3){
			
			if (getTipo()==1) {
				double calculaSeguroPF= valor*0.002+valor*0.005;
				calculoSeguroPF = (float) calculaSeguroPF;
				setSeguro(calculoSeguroPF);

			}
			
		}else
			System.out.println("Não foi possível fazer o calculo do seguro, por valores inválidos.");
		
		
	}
}
