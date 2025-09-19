package condicionais;

import java.util.Scanner;

public class Horoscopo2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        // Array com as mensagens de horóscopo na ordem dos signos
        String[] mensagens = {
            "Capricórnio: Mantenha o foco em suas metas. O esforço trará bons resultados.",
            "Aquário: Novas ideias e projetos estão no horizonte. Compartilhe-as com confiança.",
            "Peixes: Reserve um tempo para si. A intuição estará em alta e trará clareza.",
            "Áries: Tenha paciência com as pessoas ao seu redor. A impulsividade pode ser um obstáculo.",
            "Touro: Sua vida financeira pede atenção. É um bom momento para organizar as despesas.",
            "Gêmeos: A comunicação será sua maior aliada. Aproveite para fazer novas conexões.",
            "Câncer: O afeto e a família serão a sua base. Busque momentos de tranquilidade em casa.",
            "Leão: Sua energia estará alta. Use-a para liderar e inspirar aqueles ao seu redor.",
            "Virgem: Foque em sua rotina e bem-estar. Pequenos ajustes trarão grandes melhorias.",
            "Libra: O equilíbrio em suas relações será fundamental. Busque a harmonia com todos.",
            "Escorpião: Prepare-se para transformações. Confie em sua força interior para superar desafios.",
            "Sagitário: Otimismo em alta! É um bom momento para planejar viagens e novas aventuras."
        };

        // Exibição do menu
        System.out.println("=============================================");
        System.out.println("            Horóscopo do dia                 ");
        System.out.println("=============================================");
        System.out.println("        1 - Capricórnio                      ");
        System.out.println("        2 - Aquário                          ");
        System.out.println("        3 - Peixes                           ");
        System.out.println("        4 - Áries                            ");
        System.out.println("        5 - Touro                            ");
        System.out.println("        6 - Gêmeos                           ");
        System.out.println("        7 - Câncer                           ");
        System.out.println("        8 - Leão                             ");
        System.out.println("        9 - Virgem                           ");
        System.out.println("        10 - Libra                           ");
        System.out.println("        11 - Escorpião                       ");
        System.out.println("        12 - Sagitário                       ");
        System.out.println("=============================================");
        System.out.print("Digite o número do seu signo: ");

        int signo = leia.nextInt();

        // Verifica se o número digitado está dentro do intervalo válido
        if (signo >= 1 && signo <= 12) {
            // Acessa a mensagem correta no array. O índice é (signo - 1) porque arrays
            // começam em 0.
            System.out.println(mensagens[signo - 1]);
        } else {
            // Caso o número seja inválido
            System.out.println("Opção inválida! Por favor, digite um número de 1 a 12.");
        }

        leia.close();

	}

}
