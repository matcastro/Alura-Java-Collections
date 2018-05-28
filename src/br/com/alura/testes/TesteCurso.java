package br.com.alura.testes;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("C#", "Mateus");
		
		curso.adiciona(new Aula("Orientação a Objetos com C#", 20));
		curso.adiciona(new Aula("Projeto Final de C#", 30));
		
		System.out.println(curso.getAulas());
	}

}
