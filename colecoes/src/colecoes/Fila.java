package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Maria");
		fila.add("Aline");
		fila.add("Letícia");
		fila.add("Cíntia");
		fila.add("Rayssa");
		
		System.out.println(fila);
		
		// Retirar um elemento da Fila
		fila.remove();
		
		System.out.println(fila);
		
		fila.add("Milena");
		fila.add("Nadia");
		
		System.out.println(fila);
		
		// Exibir o tamanho da fila
		
		System.out.println("O tamanho da fila é: " + fila.size());
		
		for(String pessoa : fila) {
			System.out.println(pessoa);
		}
		
	}

}
