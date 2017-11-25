package br.unipe.java.projetoTeatro;

import java.util.Scanner;

public class MenuPrincipal {
	
	private byte opcao;
	private String username;
	private int lugar;
	
	Scanner leitor = new Scanner(System.in);
	
	public byte ExibeMenu()
	{
		System.out.println("Software de Teatro");
		System.out.println("------------------");
		System.out.println("1 - Ocupar lugar");
		System.out.println("2 - Lugar que deseja ocupar");
		System.out.println("3 - Desocupar lugar");
		System.out.println("4 - Exibir lugares vazios");
		System.out.println("5 - Exibir lugares ocupados");
		System.out.println("6 - Encerrar programa");
		System.out.print("Digite uma opção: ");
		
		return this.opcao = leitor.nextByte();
	}
	
	public void OcuparLugar()
	{	
		System.out.println("Ocupar Posicao");
		System.out.println("--------------");
		System.out.print("Nome do usuário: ");
		this.username = leitor.next();
		System.out.print("Qual lugar deseja ocupar?: ");
		this.lugar = leitor.nextInt();
	}
	
	public void DesocuparLugar()
	{	
		System.out.println("Desocupar Posicao");
		System.out.println("--------------");
		System.out.print("Qual lugar deseja desocupar?: ");
		this.lugar = leitor.nextInt();
	}

	public String getUsername() {
		return username;
	}

	public int getLugar() {
		return lugar;
	}
}
