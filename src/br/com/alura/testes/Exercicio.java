package br.com.alura.testes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exercicio {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		
		Set<Integer> chaves = pessoas.keySet();
		Iterator iterador = chaves.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(pessoas.get(iterador.next()));
		}
	}
}
