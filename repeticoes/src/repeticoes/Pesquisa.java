package repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		// Declarando variaveis
		int idade, esporte, futebol = 0, voleiM18 = 0, basquetem18 = 0, totalRespostas = 0;
		long somaIdades = 0;
		double mediaIdades = 0;
		 
		String continua = "S";
		
		// O loop 'while' continuará enquanto o usuário digitar 'S'
		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Pesquisa - Esporte Favorito");
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite seu esporte favorito: ");
			System.out.println("1-Futebol\n2-Volei\n3-Basquete");
			esporte = leia.nextInt();
			
			// Acumulando a idade e o total de respostas
			somaIdades += idade;
			totalRespostas++;
			
			// Verificando qual esporte foi escolhido e se a idade se enquadra nas categorias
			if (esporte == 1) {
				futebol++;
			} else if (esporte == 2 && idade > 18) {
				voleiM18++;
			} else if (esporte == 3 && idade < 18) {
				basquetem18++;
			}
			
			// Limpando o buffer do scanner para evitar erros
			leia.nextLine(); 
			
			System.out.println("Deseja continuar (S/N)?");
			continua = leia.nextLine().toUpperCase();
		}
	
		// Calculando a média das idades somente se houver respostas
		if (totalRespostas > 0) {
			mediaIdades = (double) somaIdades / totalRespostas;
		}
		
		System.out.println("\n--- Resultado da Pesquisa ---");
		System.out.println("Total de pessoas que responderam: " + totalRespostas);
		System.out.println("Total de pessoas que gostam de Futebol: " + futebol);
		System.out.println("Total de pessoas que gostam de Vôlei e são maiores de 18 anos: " + voleiM18);
		System.out.println("Total de pessoas que gostam de Basquete e são menores de 18 anos: " + basquetem18);
		System.out.printf("Média das idades das pessoas que responderam: %.2f%n", mediaIdades);
		
		leia.close();
	}	
}

