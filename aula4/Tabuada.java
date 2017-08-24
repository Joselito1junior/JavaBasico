/**
 * author: Lucas Barbosa
 */

package br.unipe.java.aula4;

import java.util.Scanner;

public class Tabuada {
	 public static void main(String args[]) {
		 
	 Scanner ler = new Scanner(System.in);
	 
	 int n;
	   
	 System.out.println("Informe qual tabuada deseja(1 a 10): ");
	 n = ler.nextInt();
	 
	 System.out.println();
	 System.out.println("Tabuada do " + n);
	 System.out.println("--------------------");
	 for (int i=1; i<=10; i++)
	 System.out.printf("%2d * %2d = %3d\n", i, n, (i*n));
	 System.out.println("--------------------");
 	}
}
