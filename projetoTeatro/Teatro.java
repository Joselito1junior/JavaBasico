package br.unipe.java.projetoTeatro;

import java.util.ArrayList;

public class Teatro {
	
	int espacoOcupado;
	private String[] ocupante = new String[100];
				
	public void OcupaLugar(String usuario, int posicao)
	{
		this.ocupante[posicao] = usuario;
		System.out.println(ocupante[posicao]);
	}
	
	public void LugarDesejaOcupar()
	{
		
	}
	
	public void DesocuparLugar(int lugar)
	{
		ocupante[lugar] = null;
		System.out.println(ocupante[lugar]);
	}
	
	public void ExibirLugaresVazios()
	{
		
	}
	
	public void ExibirLugaresPreenchidos()
	{
		
	}
	
	public boolean VerificaEspacosVazios(int lugar)
	{
		return (ocupante[lugar] == null);
	}
}
