package br.unipe.java.projetoTeatro;

public class UsaTeatro {
	public static void main(String[] args) {
		
		MenuPrincipal Menu = new MenuPrincipal();
		Teatro sala1 = new Teatro();
		byte opcao;
		
		do
		{
			opcao = Menu.ExibeMenu();
			
			switch(opcao)
			{
				case 1: Menu.OcuparLugar();
						sala1.OcupaLugar(Menu.getUsername(), Menu.getLugar());
						break;
						
				case 3: Menu.DesocuparLugar();
						sala1.DesocuparLugar(Menu.getLugar());
						break;		
			}
		}while(opcao != -1);
	}
}
