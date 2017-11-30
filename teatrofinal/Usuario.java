package br.unipe.java.teatrofinal;

public class Usuario implements Serializable {
	
	
	private int posicao;
    private String nome, cpf;
    
    Usuario(){
        
    }
    
    Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.posicao = 0;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    } 
}
