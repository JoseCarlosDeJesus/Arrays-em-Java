package br.com.pc2.semana5;

public class Array5 {

	public static void main(String[] args) {
		/*
		 * int[][] tabelaDeNumeros = new int[2][3]; for(int i = 0; i <
		 * tabelaDeNumeros.length; i++) { for(int j = 0; j < tabelaDeNumeros[i].length;
		 * j++) { System.out.println(tabelaDeNumeros[i][j]); } }
		 */

		String[][] pessoas = new String[5][3];

		pessoas[0][0] = "Maria";
		pessoas[0][1] = "Silva";
		pessoas[0][2] = "MASI";
		pessoas[1][0] = "João";
		pessoas[1][1] = "Santos";
		pessoas[1][2] = "JOSA";
		pessoas[2][0] = "Mara";
		pessoas[2][1] = "Almeida";
		pessoas[2][2] = "MADA";
		pessoas[3][0] = "Marta";
		pessoas[3][1] = "Costa";
		pessoas[3][2] = "MACO";
		pessoas[4][0] = "Carla";
		pessoas[4][1] = "Souza";
		pessoas[4][2] = "CASO";

		for (int i = 0; i < pessoas.length; i++) {
			for (int j = 0; j < pessoas[i].length; j++) {
				System.out.print(pessoas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
