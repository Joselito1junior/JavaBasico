package br.unipe.java.seguradora;

public class UsaMenu {
	public static void main(String[] args) {
						
		MenuPrincipal menu = new MenuPrincipal();
		int opcao;
		int numCliente = 0; //Guarda o inidice com o número de clientes cadastrados
		
		do
		{
			opcao = menu.exibeMenu();
			
			switch(opcao)
			{
				case 1: UsaCliente cliente = new UsaCliente();
						int clienteTipo = cliente.tipoCliente();
						numCliente++;
						break;
			}
			
		}while(opcao != 8);
		System.out.println("Você Saiu! Até mais.");
	}
}
