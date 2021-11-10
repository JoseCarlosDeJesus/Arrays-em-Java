package br.com.pc2.semana5;

public class Array3 {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		
		numeros[2] = 90;
		
		//numeros[5] = 90;//Gera exceção
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("index = "+i+", posição = "+(i+1)+", valor = "+numeros[i]);
		}
		
		System.out.println("Valor do array no índice 2: "+numeros[2]);

	}

}
