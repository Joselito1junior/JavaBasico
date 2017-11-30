package br.unipe.java.teatrofinal;

import java.io.Serializable;
import java.util.Scanner;

public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Scanner scn;
	private static Scanner scn2;

	static void inicializacao(){
        System.out.println("Bem vindo ao teatro! \nDeseja inicializar um arquivo?");
        System.out.println("S - Sim\nN - Não");
        scn = new Scanner(System.in);
       String rec = scn.nextLine();
       if(rec.equals("S")){
           System.out.println("Digite o nome do arquivo: ");
          String nomeArquivo = scn.nextLine();
          Serializa.carregarLugares(nomeArquivo);
          Serializa.loadClientes(nomeArquivo);
          
       }
    }
    
   static void exibirMenu(){
		System.out.println("\t\n>>>MENU TEATRO<<<   \n\n");
		System.out.println("1- Listar cadeiras livres");
		System.out.println("2- Listar cadeiras ocupadas ");
		System.out.println("3- Consultar cliente");
		System.out.println("4- Cadastrar cliente");
		System.out.println("5- Desocupar Lugar");
		System.out.println("6- Ocupar Lugar");
		System.out.println("7- Encerrar Programa");
		
		System.out.print("\nInforme uma das opções acima: ");
    }
   
   static void receberOpc(Cadeira cad){
       scn2 = new Scanner(System.in);
       try {
              int opc = scn2.nextInt();
       int opc2;
       
       
       switch(opc){
            case 1:
                ;
                Cadeira.exibirLugarVazio();
                break;
            case 2:
                
                Cadeira.exibirLugarOcupados();
                break;
                
            case 3: 
                System.out.println("Digite o cpf do usuário: ");
                Scanner scnC = new Scanner(System.in);
                   Usuario usaC = Serializa.ConsulteCpf(scnC.nextLine());
                   if(usaC != null){
                       System.out.println("Nome: "+ usaC.getNome());
                       System.out.println("Cpf: "+ usaC.getCpf());
                       System.out.println("Alocação: " + usaC.getPosicao());
                   }else{
                       System.out.println("Usuário não encontrado");
                   }
                break;
                
                case 4:
                    Usuario usa = new Usuario();
                    Scanner scnU = new Scanner(System.in);
                    System.out.println("Digite o nome do usuário: ");
                    usa.setNome(scnU.nextLine());
                    System.out.println("Digite o cpf do usuário: ");
                    usa.setCpf(scnU.nextLine());
                    if(!Serializa.testCpf(usa)){
                        Serializa.cadUsuario(usa);
                        System.out.println("Usuário cadastrado com sucesso!");
                    }else{
                        System.out.println("Cpf já está em uso");
                        
                    }
                    break;
                    
                case 5:
                    System.out.println("Digite o numero da cadeira que deseja desocupar");
                    
                  
                    try {
                        opc2 = scn2.nextInt();
                        if(Cadeira.desalocaLugar(opc2)){
                        System.out.println("Posição livre");
                    }else{
                        System.out.println("Posição está livre");
                    }
                    } catch (Exception e) {
                        System.out.println("Posição indisponivel");
                    }
                    break;
                    

                 case 6:
                     System.out.println("Digite o cpf");
                     Scanner recC = new Scanner(System.in);
                     Usuario UsuCad = Serializa.ConsulteCpf(recC.nextLine());
                     if(UsuCad != null){
                         System.out.println("Digite a posição:");
                    
                    
                     try {
                         opc2 = scn2.nextInt();
                         
                         if(Cadeira.alocaLugar(opc2, UsuCad)){
                         UsuCad.setPosicao(opc2);
                        System.out.println("Posição ocupada");
                    }else {
                        System.out.println("Posição indisponível");
                    }
                     } catch (Exception e) {
                         System.out.println("Posição indisponível");
                     }
                     }else{
                         System.out.println("Usuário não cadastrado");
                     }
                    
                    break;
                    
                 case 7:
                     System.out.println("Deseja salvar?");
                     System.out.println("S - Sim\nN - Não");
                     Scanner scn2 = new Scanner(System.in);
                 String rec = scn2.nextLine();
                 if(rec.equals("S")){
                     System.out.println("Digite o nome do arquivo: ");
                     String nomeArquivo = scn2.nextLine();
                     Serializa.serializaClientes(nomeArquivo);
                     Serializa.salvarLugares(nomeArquivo);
                 	}
                 System.exit(0);
                 break;
           
            default:
                 System.out.println("Esta opção não é válida");
    }
   
} catch (Exception e) {
           System.out.println("Opção invalida");
       }

   
}
}