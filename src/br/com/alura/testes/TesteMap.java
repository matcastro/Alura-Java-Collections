package br.com.alura.testes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {
	public static void main(String[] args) {
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		Set<String> chaves = nomesParaIdade.keySet();
		Collection<Integer> valores = nomesParaIdade.values();
		Set<Entry<String, Integer>> chaveValores = nomesParaIdade.entrySet();
		
		chaves.forEach(chave ->{
			System.out.println(chave);
		});
		
		valores.forEach(valor ->{
			System.out.println(valor);
		});
		
		for (Entry<String, Integer> chaveValor : chaveValores) {
			System.out.println(chaveValor.getKey() + " - " + chaveValor.getValue());
		}
	}
}
