package strings;

import java.util.Scanner;

public class Exercicio016 {
	public static void main(String[] args) {
		// 16. Crie um programa que leia duas palavras e as concatene, exibindo a
		// palavra resultante.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 23). Kindle Edition.

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a primeira palavra: ");
		String primeiraPalavra = leitor.nextLine();

		System.out.print("Digite a segunda palavra: ");
		String segundaPalavra = leitor.nextLine();

		System.out.println("Resultado da concatenação: " + primeiraPalavra + segundaPalavra);

		leitor.close();

	}
}
