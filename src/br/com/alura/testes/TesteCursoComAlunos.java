package br.com.alura.testes;

import java.util.Collections;
import java.util.Set;

import br.com.alura.Aluno;
import br.com.alura.Curso;

public class TesteCursoComAlunos {

	public static void main(String[] args) {
		Curso curso = new Curso("Curso de teste","Instrutor");
		Aluno a1 = new Aluno("Mateus", 123);
		Aluno a2 = new Aluno("Tatiana", 456);
		Aluno a3 = new Aluno("Thiago", 789);
		
		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);
		
		//Set<Aluno> alunos = curso.getAlunos();
		//alunos.add(new Aluno("",1));
		System.out.println(curso.getAlunos());
		
		//TesteEmptySet
		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo");
	}

}
