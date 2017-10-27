package br.unipe.java.aula15;

import java.util.ArrayList;

public class ArrayListExemplo {
	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList <>();
				
		num.add(0);
		num.add(-1);
		
		for(Integer integer : num) {
			System.out.println(integer);
		}
	}
}
