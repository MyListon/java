package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		String nomes[] = { "Maria", "João", "Alexandre", "Rafaela", "Cristiano" };

		int numeros[] = new int[5];

		System.out.println("Listagem - Vetro de Nomes");
		
		// Ordernar o vetor
		
		Arrays.sort(nomes);
		
		Arrays.sort(nomes, Collections.reverseOrder());

		for (int indice = 0; indice < nomes.length; indice++) {
			System.out.printf("nomes[%d] = %s%n", indice, nomes[indice]);

		}
		
		System.out.println("\nInput de dados - Vetor de Números");
		
		for(int indice = 0; indice < numeros.length; indice ++) {
			System.out.println("Digite um número: ");
			numeros[indice] = leia.nextInt();
		}
		
		Arrays.sort(numeros);

		System.out.println("\nListagem - Vetor de Números");

		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.printf("nomes[%d] = %d%n", indice, numeros[indice]);
		}
		
		leia.close();
	}
}