package br.unipe.java.aula13;

public class Empresa {

	public void contratar(double proposta) throws SalarioException
	{
		if(proposta > 2.500)
		{
			throw new SalarioException();
		}else
		{
			System.out.println("Contrata programador Junior");
		}
	}
}