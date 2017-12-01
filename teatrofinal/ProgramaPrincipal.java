package br.unipe.java.teatrofinal;

public class ProgramaPrincipal implements Serializable{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu.inicializacao();
        Cadeira cad = new Cadeira();
        
        while(true){
            
            Menu.exibirMenu();
            Menu.receberOpc(cad);
        }
    }
}
