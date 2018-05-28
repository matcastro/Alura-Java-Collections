package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TesteCurso2 {

	public static void main(String[] args) {
		Curso curso = new Curso("C#", "Mateus");
		
		curso.adiciona(new Aula("Orientação a Objetos com C#", 20));
		curso.adiciona(new Aula("Projeto Final de C#", 30));
		curso.adiciona(new Aula("Certificado C#", 5));
		
		List<Aula> aulasImutaveis = curso.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(curso.getTempoTotal());
		System.out.println(curso);
	}

}
