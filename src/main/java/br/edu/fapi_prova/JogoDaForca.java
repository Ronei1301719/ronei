package br.edu.fapi_prova;

import java.util.Scanner;

public class JogoDaForca {
	
	public void executaForca() {
		Scanner scanner = new Scanner(System.in);
		String palavra;
		int opcao = 0;

		System.out.println("Este é um jogo da forca. Deseja jogar? 1 - Sim || 2 - Não");
		opcao = scanner.nextInt();

		while (opcao == 1) {

			System.out.println("|------------------------------------|");
			System.out.println("|---------JOGO DA FORCA RONEI--------|");
			System.out.println("|------------------------------------|");
			System.out.println("");
			System.out.println("");

			System.out.println("Por favor, insira a palavra: ");
			palavra = scanner.next();
			int cont;
			int letra = palavra.length();
			int erros = 5;
			char trocar[] = new char[letra];
			for (cont = 0; cont < letra; cont++) {
				trocar[cont] = '_';
				System.out.print(trocar[cont] + " ");
			}

			String palpite;
			char adivinhando[] = new char[letra];
			char adivinhaPalavra[] = new char[letra];
			int acerto = palavra.length();
			
			do {
				System.out.print("\nDigite uma letra: ");
				palpite = scanner.next();

				if (palavra.contains(palpite)) {
					for (cont = 0; cont < letra; cont++) {
						adivinhando[cont] = palpite.toCharArray()[0];
						adivinhaPalavra[cont] = palavra.toCharArray()[cont];
						if (adivinhando[cont] == adivinhaPalavra[cont]) {
							trocar[cont] = adivinhando[cont];
							acerto--; 
						}
												
						System.out.print(trocar[cont] + " ");
											
						
					}

				} else if (!palavra.contains(palpite)) {
					erros--;

				}

				System.out.println("\nChances Restantes: " + erros);
			} while (acerto > 0 && erros > 0);
				if (acerto == 0 ) {
				System.out.println("");
				System.out.println("Parabéns!! Você Ganhou.");
				System.out.println("");
				}
				
				if (erros == 0 ) {
					System.out.println("");
					System.out.println("Que pena, você perdeu.");
					System.out.println("");
					}
			
			System.out.println("Deseja jogar novamente? 1 - Sim || 2 - Não");
			opcao = scanner.nextInt();

		}

		System.out.println("Ok!! Volte outra hora!!");

	}

}


