package br.unipe.java.seguradora2_0;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal 
{
	public static void main(String[] args) 
	{
		ArrayList<ClientesPF> listaPF = new ArrayList<>();
		ArrayList<ClientesPJ> listaPJ = new ArrayList<>();
		
		ClientesPF pf = new ClientesPF();
		ClientesPF pf1 = new ClientesPF();
		ClientesPJ pj = new ClientesPJ();
		
		byte teste = 0;
		

		byte opcao = 0;
		byte opc = -1; //Armazena uma das opções dentro do switch
		
		Scanner leitor = new Scanner(System.in);
	
		do 
		{
			System.out.println("----------------------");
			System.out.println("SEGURADORA");
			System.out.println("----------------------");
			System.out.println("[MENU PRINCIPAL]");
					
			System.out.println("1 - CADASTRO DE CLIENTES");
			System.out.println("2 - LISTA DE CLIENTES");
			System.out.println("3 - CADASTRO DE SINISTRO");
			System.out.println("4 - LISTA DE SINISTRO");
			System.out.println("5 - LISTA DE CONTRATOS SEM SINISTRO");
			System.out.println("-1 - SAIR ");

			System.out.print("Escolha uma opção: ");
			opcao = leitor.nextByte();
			
			switch(opcao)
			{
				case 1: System.out.print("Você deseja cadastrar PF ou PJ:\n1 - PF\n2 - PJ\nDigite sua opção: ");
						opc = leitor.nextByte();
						if(opc == 1) 
						{
							pf.cadastraCliPF();						
							listaPF.add(pf);
						}
						else if(opc == 2)
						{
							pj.cadastraCliPJ();
							listaPJ.add(pj);
						}
						else
							System.out.println("Informe uma das opções acima");
						break;
						
				case 2: System.out.print("\nVocê deseja visualizar\n1 - Clientes P.F.\n2 - Clientes P.J.\n3 - Sair\nDigite uma opcao: "); 
						opc = leitor.nextByte();
						
						switch(opc)
						{
							case 1: for(int i = 0; i < listaPF.size(); i++)
									{
										System.out.println("\nOs dados do " + i +"° cliente são:");
										System.out.println("Nome: " + listaPF.get(i).getNome());
										System.out.println("CEP: " + listaPF.get(i).getCep());
										System.out.println("Numero: " + listaPF.get(i).getNumero());
										System.out.println("Zona: " + listaPF.get(i).getZona());
										System.out.println("Tipo: " + listaPF.get(i).getTipo());
										System.out.println("Valor: " + listaPF.get(i).getValor());
										System.out.println("Valor do seguro: "+ listaPF.get(i).getSeguro());
									}
									break;
									
							case 2: for(int i = 0; i < listaPJ.size(); i++)
									{
										System.out.println("\nOs dados do " + i +"° cliente são:");
										System.out.println("Nome: " + listaPJ.get(i).getNome());
										System.out.println("CEP: " + listaPJ.get(i).getCep());
										System.out.println("Numero: " + listaPJ.get(i).getNumero());
										System.out.println("Zona: " + listaPJ.get(i).getZona());
										System.out.println("Qtd. Funcionarios: " + listaPJ.get(i).getNumFuncionarios());
										System.out.println("Qtd. Visitas: " + listaPJ.get(i).getNumVisitasDia());
										System.out.println("Ramo: " + listaPJ.get(i).getRamo());
										System.out.println("Valor: " + listaPJ.get(i).getValor());

									}
									break;
							case 3: break;
							
							default: System.out.println("\nInforme uma das opções acima!");
						}
						break;
						
				case 3: System.out.print("Deseja adicionar um novo sinistro para\n1 - PF\n2 - PJ\nDigite sua opção: ");
						opc = leitor.nextByte();
						
						switch(opc)
						{
							case 1: System.out.println("\nEm qual cadastro deseja incluir o sinistro?");
									System.out.println("Digite: ");
									opc = leitor.nextByte();
									for(int i = 0; i < listaPJ.size(); i++)
										System.out.print(i +"°Nome: " + listaPJ.get(i).getNome());
						}
						break;
			}
		}while(opcao != -1);
	}
}
