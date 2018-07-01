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

			System.out.println("|----------------------------------------|");
			System.out.println("|-----------JOGO DA FORCA RONEI----------|");
			System.out.println("|----------------------------------------|");
			System.out.println("");
			System.out.println("");
			System.out.println("|----------------------------------------|");
			System.out.println("|O usuário 1 deve aguardar o usuário 2    ");
			System.out.println("|inserir a palavra sem olhar para a tela.|");
			System.out.println("|----------------------------------------|");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("Usuário 2, por favor, insira a palavra: ");
			palavra = scanner.next();
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
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
			int acertos = palavra.length();
		
			
			do {
				System.out.print("\n Usuário 1, por favor digite uma letra: ");
				palpite = scanner.next();
							
				System.out.print("");
				System.out.print("");
				
				if (palavra.contains(palpite)) {
					for (cont = 0; cont < letra; cont++) {
						adivinhando[cont] = palpite.toCharArray()[0];
						adivinhaPalavra[cont] = palavra.toCharArray()[cont];
						if (adivinhando[cont] == adivinhaPalavra[cont]) {
							trocar[cont] = adivinhando[cont];
							acertos--;
						}
												
						System.out.print(trocar[cont] + " ");
						
					}

				} else if (!palavra.contains(palpite)) {
					erros--;

				}

				System.out.println("\nVocê ainda tem " + erros + " chances");
				
			} while (acertos > 0 && erros > 0);
			if (acertos == 0) {
				System.out.println("|----------------------------------------|");
				System.out.println("|----------PARABÉNS, VOCÊ VENCEU---------|");
				System.out.println("|----------------------------------------|");
			}

			if (erros == 0) {
				System.out.println("|----------------------------------------|");
				System.out.println("|----------QUE PENA, VOCÊ PERDEU---------|");
				System.out.println("|----------------------------------------|");
			}

			System.out.println("Deseja jogar novamente? 1 - Sim || 2 - Não");
			opcao = scanner.nextInt();

		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Ok!! Volte outra hora!!");

	}
}
