package br.com.pc2.semana5;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		Arrays.fill(numeros, 6);
		
		for(int i : numeros) {
			System.out.println(i);
		}
		
		int[] numeros1 = {3,90,67,56,78};
		
		System.out.println(Arrays.binarySearch(numeros1, 56));

	}

}
