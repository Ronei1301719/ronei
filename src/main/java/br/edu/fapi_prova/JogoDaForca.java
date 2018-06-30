
package br.edu.fapi_prova;

import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra;
		int opcao = 0;

		System.out.println("Este é um jogo da forca. Deseja jogar? 1 - Sim *** 2 - Não");
		opcao = teclado.nextInt();

		while (opcao == 1) {

			System.out.println("|------------------------------------|");
			System.out.println("|---------JOGO DA FORCA RONEI--------|");
			System.out.println("|------------------------------------|");
			System.out.println("");
			System.out.println("");

			System.out.println("Por favor, insira a palavra: ");
			palavra = teclado.next();
			int i;
			int count = palavra.length();
			int contador = 0;
			int erros = 5;
			char trocar[] = new char[count];
			for (i = 0; i < count; i++) {
				trocar[i] = '_';
				System.out.print(trocar[i] + " ");
			}

			String adivinhar;
			char adivinhando[] = new char[count];
			char adivinhaPalavra[] = new char[count];

			do {
				System.out.print("\nDigite uma letra: ");
				adivinhar = teclado.next();

				if (palavra.contains(adivinhar)) {
					for (i = 0; i < count; i++) {
						adivinhando[i] = adivinhar.toCharArray()[0];
						adivinhaPalavra[i] = palavra.toCharArray()[i];
						if (adivinhando[i] == adivinhaPalavra[i]) {
							trocar[i] = adivinhando[i];

						}

						System.out.print(trocar[i] + " ");
						
						if (trocar[i] == 0) {
							System.out.println("");
							System.out.println("Parabéns!! Você Ganhou.");
							System.out.println("");
							//System.out.println("Deseja jogar novamente? 1 - Sim -- 2 - Não");
							//opcao = teclado.nextInt();
							//System.out.println("");
						}
					}

				} else if (!palavra.contains(adivinhar)) {
					erros--;

				}

				System.out.println("\nChances Restantes: " + erros);
			} while (erros > 0);
			System.out.println("");
			System.out.println("Acabaram suas chances!! Você Perdeu!");
			System.out.println("");

			System.out.println("Deseja jogar novamente? 1 - Sim -- 2 - Não");
			opcao = teclado.nextInt();

		}

		System.out.println("Ok!! Volte outra hora!!");

	}
}
