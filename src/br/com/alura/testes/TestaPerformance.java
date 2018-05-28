package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		Collection<Integer> numeros = new HashSet<Integer>();
		long inicio = System.currentTimeMillis();
		
		for(int i = 1; i<=100000;i++) {
			numeros.add(i);
		}
		long  meio = System.currentTimeMillis();
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		long tempoDeInsercoes = meio - inicio;
		long tempoDeBusca = fim - meio;
		System.out.println("Inserções: " + tempoDeInsercoes + "\nBuscas: " + tempoDeBusca);
		System.out.println("Tempo gasto: " + tempoDeExecucao);
	}

}
