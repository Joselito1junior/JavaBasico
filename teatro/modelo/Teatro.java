package br.unipe.java.teatro.modelo;

public class Teatro {

	Cadeira[] cadeiras = new Cadeira[100];
	
	
	public Teatro() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean ocupar(Cadeira cadeira) {
		
		try {
			
		 this.cadeiras[cadeira.getPosicao()-1] = cadeira;
		
		}catch (Exception e) {
			return false;
		}
		return true;
			
	}
	
	
	public boolean desocupar(int posicao) {
		
		try {
			
		 this.cadeiras[posicao-1] = null;
		
		}catch (Exception e) {
			return false;
		}
		return true;			
	}

	/**
	 * Verifica se a posição esta ocupada
	 * @param posicao contendo a posição a ser ocupada
	 * @return <boolean> true se estiver livre ou false se estiver ocupado
	 */
	public boolean isDisponivel(int posicao) {
		
		int posicaoVetor = posicao -1;	
		if(this.cadeiras[posicaoVetor]==null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * Consulta CPF nas cadeiras 
	 * @param cpf
	 * @return
	 */
	public Cadeira consultarLugarPorCpf(String cpf) {
		
		for(Cadeira cadeira : this.cadeiras) {
			if(cadeira!=null) {
				if(cadeira.getUsuario().getCpf().equalsIgnoreCase(cpf)) {
					return cadeira;
				}
			}
		}
		
		return null;
	}
	
public Cadeira listarCadeirasVazias() {
		
		for(int posicao = 0; posicao< this.cadeiras.length;posicao++ )   {
			if(this.cadeiras[posicao]==null) {
				System.out.println("["+ (posicao+1) +"] - Vazia" );
			}
		}
		
		return null;
	}

public Cadeira listarCadeirasOcupadas() {
	
	for(int posicao = 0; posicao< this.cadeiras.length;posicao++ )   {
		if(this.cadeiras[posicao]!=null) {
			System.out.println("["+ (posicao+1) +"] - Ocupado" );
		}
	}
	
	return null;
}
}
