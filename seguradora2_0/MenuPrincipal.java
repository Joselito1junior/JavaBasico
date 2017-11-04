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
		ClientesPJ pj = new ClientesPJ();
		
		byte opcao = 0;
		
		Scanner leitor = new Scanner(System.in);
	
		do 
		{
			byte opc = -1; //Armazena uma das opções dentro do switch
			
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
							pf = new ClientesPF();
							pf.cadastraCliPF();
							listaPF.add(pf);
						}
						else if(opc == 2)
						{
							pj = new ClientesPJ();
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
										pf = listaPF.get(i);
										MenuPrincipal.listaClientesPf(i, pf);
									}
									break;
									
							case 2: for(int i = 0; i < listaPJ.size(); i++)
									{
										pj = listaPJ.get(i);
										MenuPrincipal.listaClientesPJ(i, pj);
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
							case 1: for(int i = 0; i < listaPF.size(); i++)
									{
										pf = listaPF.get(i);
										MenuPrincipal.listaClientesPf(i, pf);
									}
									
									System.out.println("\nEm qual cadastro deseja incluir o sinistro?");
									System.out.print("Digite: ");
									
									int cliente = leitor.nextByte();
									
									System.out.print("Qual sinistro deseja adicionar\n1 - Furto\\Roubo\n2 - Incêndio\n3 - Inundação\nDigite sua opção: ");
									opc = leitor.nextByte();
									
									listaPF.get(cliente).addSinistro(opc);								
						}
						break;
				case 4: System.out.print("Deseja ver os sinistros dos clientes\n1 - PF\n2 - PJ\nDigite sua opção: ");
						opc = leitor.nextByte();
						
						switch(opc)
						{
							case 1: for(int i = 0; i < listaPF.size(); i++)
									{
										pf = listaPF.get(i);
										MenuPrincipal.listaClientesPf(i, pf);
									}
									
									System.out.println("\nDeseja verificar o sinistro de qual cliente?");
									System.out.print("Digite: ");
									int cliente = leitor.nextByte();
									
									listaPF.get(cliente).getSinistro();
						}
						break;
				
				
				
			}
		}while(opcao != -1);
		leitor.close();
	}
	
	public static void listaClientesPf(int clienteNum, ClientesPF pf){
		
		
		System.out.println("\nOs dados do " + clienteNum +"° cliente são:");
		System.out.println("Nome: " + pf.getNome());
		System.out.println("CEP: " + pf.getCep());
		System.out.println("Numero: " + pf.getNumero());
		System.out.println("Zona: " + pf.getZona());
		System.out.println("Tipo: " + pf.getTipo());
		System.out.println("Valor: " + pf.getValor());
		System.out.println("Valor do seguro: "+ pf.getSeguro());	
	}
	
	public static void listaClientesPJ(int clienteNum, ClientesPJ pj){
		
		System.out.println("\nOs dados do " + clienteNum +"° cliente são:");
		System.out.println("Nome: " + pj.getNome());
		System.out.println("CEP: " + pj.getCep());
		System.out.println("Numero: " + pj.getNumero());
		System.out.println("Zona: " + pj.getZona());
		System.out.println("Qtd. Funcionarios: " + pj.getNumFuncionarios());
		System.out.println("Qtd. Visitas: " + pj.getNumVisitasDia());
		System.out.println("Ramo: " + pj.getRamo());
		System.out.println("Valor: " + pj.getValor());

	}
}
