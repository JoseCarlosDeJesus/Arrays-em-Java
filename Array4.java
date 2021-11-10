package br.com.pc2.semana5;

public class Array4 {

	public static void main(String[] args) {
		Curso[] listaDeCursos = new Curso[2];
		Curso c1 = new Curso();
		Curso c2 = new Curso();
		
		c1.codigo = 123;
		c1.descricao = "Java Básico";
		c1.cargaHoraria = 30;
		
		c2.codigo = 234;
		c2.descricao = "Banco de dados II";
		c2.cargaHoraria = 20;
		
		listaDeCursos[0] = c1;
		listaDeCursos[1] = c2;
		
		for(int i = 0; i < listaDeCursos.length; i++) {
			System.out.println(listaDeCursos[i]);
		}
		
		System.out.println("Descrição do curso 1: "+listaDeCursos[0].descricao);
		
		for(Curso c : listaDeCursos) {
			System.out.println(c);
		}

	}

}
