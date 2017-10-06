package br.unipe.java.aula13;

public class RH {
	public static void main(String[] args) {
	
		Empresa empresaSoftware = new Empresa();
		
		//empresaSoftware.contratar(2.700);
		//Double salarioProposta = null;
		Double salarioProposta = 1.700;
		
		try {
			empresaSoftware.contratar(salarioProposta);
		} catch (SalarioException e) {
			// TODO: handle exception
			System.out.println("Erro de salario");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro inesperado");
		}
	}
}
