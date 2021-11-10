package br.com.pc2.semana5;

public class Array6 {

	public static void main(String[] args) {
		int[][] tn = {{1,8},{2,90},{3,67}};
		
		System.out.println("Linhas: "+tn.length);
		System.out.println("Colunas: "+tn[1].length);
		
		for (int i = 0; i < tn.length; i++) {
			for (int j = 0; j < tn[i].length; j++) {
				System.out.println(tn[i][j]);
			}
		}

	}

}
