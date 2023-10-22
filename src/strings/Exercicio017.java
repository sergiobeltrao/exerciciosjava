package strings;

import java.util.Scanner;

public class Exercicio017 {
	public static void main(String[] args) {
		// 17. Faça um programa que receba uma palavra e exiba cada letra separadamente
		// (necessita de laço de repetição).

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 24). Kindle Edition.

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = leitor.nextLine();

		int tamanhoDaPalavra = palavra.length();

		for (int i = 0; i < tamanhoDaPalavra; i++) {
			System.out.println(palavra.charAt(i));
		}

		leitor.close();
	}
}
