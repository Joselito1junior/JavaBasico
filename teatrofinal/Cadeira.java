package br.unipe.java.teatrofinal;

import java.io.Serializable;

public class Cadeira implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Usuario[] usua = new Usuario[100];
    
    
    static void iniciaCadeiras(Usuario[] usua){
        Cadeira.usua = usua;
    }
    
    static boolean alocaLugar(int lugar, Usuario usu){
        
        if(usua[lugar-1] == null){
            usu.setPosicao(lugar);
            Cadeira.usua[lugar-1] = usu;
            
        return true;
        }
        return false;
    }
    
    static boolean desalocaLugar(int lugar){
        if(usua[lugar-1] != null){
            Usuario use = usua[lugar-1];
            use.setPosicao(0);
            usua[lugar-1] = null;
            return true;
        }
        
        return false;
    }
    
    static void exibirLugarVazio(){
        int a = 0;
        for (int i = 0; i < usua.length; i++) {
            if(usua[i] == null){
                System.out.println("A posição "+ (i+1) + " está vazia");
                a++;
            }
           }
        if(a==0){
            System.out.println("Não há cadeiras disponiveis");
        }
    }
    
    static void exibirLugarOcupados(){
        int a = 0;
        for (int i = 0; i < usua.length; i++) {
            if(usua[i] != null){
                System.out.println(" A Posição "+ (i+1) + " está ocupada");
                a++;
            }
           }
        if(a==0){
            System.out.println("Todas as cadeiras estão livres");
        }
    }
}