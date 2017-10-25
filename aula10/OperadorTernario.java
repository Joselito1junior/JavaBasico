package br.unipe.java.aula10;

public class OperadorTernario {

	public static void main(String[] args) {
		int y = 5;
		//int y = 80;
		int x = (y == 5)? 50 : 100;
		System.out.println(x);
		
		String z = 1 + 2 + 3 + " i ai " + 8 + 9 + 10;
		System.out.println(z);
		
		double d = 8 + 9L + 8.9;
		System.out.println(d);
		
		x = 5;
		
		if(x == 10)
		{
			System.out.println("Funcionou");
		}
		
		int[] listaNumeros = {1,2,3,4,5,6,7,8};
		
		for(int num: listaNumeros)
			System.out.print(num);
		
			
		x = (5 == y)? y > 50 ? 60 : 90 : 100;
		System.out.println(x);
	}
		
}
