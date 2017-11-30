package br.unipe.java.teatrofinal;

import java.io.Serializable;
import java.util.Scanner;

public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Scanner scn;
	private static Scanner scn2;

	static void inicializacao(){
        System.out.println("Deseja inicializar um arquivo? Digite 'S'");
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
       System.out.println("1 � Cadastrar Usu�rio");
       System.out.println("2 � Consultar Usu�rio");
       System.out.println("3 � Ocupar lugar");
       System.out.println("4 � Desocupar lugar");
       System.out.println("5 - Exibir lugares vazios");
       System.out.println("6 - Exibir lugares ocupados");
       System.out.println("7 -Encerrar programa.");
    }
   
   static void receberOpc(Cadeira cad){
       scn2 = new Scanner(System.in);
       try {
              int opc = scn2.nextInt();
       int opc2;
       
       
       switch(opc){
            case 1:
                Usuario usa = new Usuario();
                Scanner scnU = new Scanner(System.in);
                System.out.println("Digite o nome do usu�rio: ");
                usa.setNome(scnU.nextLine());
                System.out.println("Digite o cpf do usu�rio: ");
                usa.setCpf(scnU.nextLine());
                if(!Serializa.testCpf(usa)){
                    Serializa.cadUsuario(usa);
                    System.out.println("Usu�rio cadastrado com sucesso!");
                }else{
                    System.out.println("Cpf j� est� em uso");
                    
                }
                break;
                
             case 2: 
                 System.out.println("Digite o cpf do usu�rio: ");
                 Scanner scnC = new Scanner(System.in);
                    Usuario usaC = Serializa.ConsulteCpf(scnC.nextLine());
                    if(usaC != null){
                        System.out.println("Nome: "+ usaC.getNome());
                        System.out.println("Cpf: "+ usaC.getCpf());
                        System.out.println("Aloca��o: " + usaC.getPosicao());
                    }else{
                        System.out.println("Usu�rio n�o encontrado");
                    }
                 break;
             case 3:
                 System.out.println("Digite o cpf");
                 Scanner recC = new Scanner(System.in);
                 Usuario UsuCad = Serializa.ConsulteCpf(recC.nextLine());
                 if(UsuCad != null){
                     System.out.println("Digite o n�mero do lugar a ser ocupado.");
                
                
                 try {
                     opc2 = scn2.nextInt();
                     
                     if(Cadeira.alocaLugar(opc2, UsuCad)){
                     UsuCad.setPosicao(opc2);
                    System.out.println("Cadeira ocupada com sucesso!");
                }else {
                    System.out.println("Cadeira n�o est� disponivel");
                }
                 } catch (Exception e) {
                     System.out.println("Cadeira n�o est� disponivel");
                 }
                 }else{
                     System.out.println("Usu�rio n�o cadastrado");
                 }
                
                break;
            case 4:
                System.out.println("Digite o numero da cadeira que deseja desocupar");
                
              
                try {
                    opc2 = scn2.nextInt();
                    if(Cadeira.desalocaLugar(opc2)){
                    System.out.println("Cadeira desocupada com sucesso");
                }else{
                    System.out.println("Cadeira j� est� desocupada");
                }
                } catch (Exception e) {
                    System.out.println("Cadeira n�o est� disponivel");
                }
                break;
            case 5:
                ;
                Cadeira.exibirLugarVazio();
                break;
            case 6:
                
                Cadeira.exibirLugarOcupados();
                break;
                
                case 7:
                    System.out.println("Deseja salvar? S/N");
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
                 System.out.println("Esta op��o n�o � v�lida");
    }
   
} catch (Exception e) {
           System.out.println("Op��o invalida");
       }

   
}
}