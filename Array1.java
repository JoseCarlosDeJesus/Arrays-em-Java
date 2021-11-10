package br.com.pc2.semana5;

public class Array1 {

	public static void main(String[] args) {
		int[] numeros = new int[3];

		Integer[] numeros1 = new Integer[3];

		Curso[] cursos = new Curso[3];

		String[] nomes = new String[3];

		// [0,0,0]

		/*
		 * for(byte i = 0; i < 3; i++) {
		 * 
		 * if(i < 3) { int n = numeros[i]/numeros[i+1];//Gera uma exceção }
		 * 
		 * System.out.println(numeros[i]); }
		 */

		/*
		 * for(byte i = 0; i < 3; i++) { System.out.println(numeros1[i]); }
		 */
		/*
		 * for(byte i = 0; i < 3; i++) { System.out.println(cursos[i]); }
		 */

		for (int i : numeros) {
			System.out.println(i);
		}

	}

}
