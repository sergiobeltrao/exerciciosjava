package strings;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio019 {
	public static void main(String[] args) {
		// 19. Escreva um programa que receba um nome e verifique se o mesmo começa com
		// a letra "A".

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 28). Kindle Edition.

		Locale.setDefault(new Locale("pt", "BR"));
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String nome = leitor.nextLine();

		if (nome.charAt(0) == 'A') {

			System.out.println("Começa com 'A'");

		} else {

			System.out.printf("Não começa com 'A' e sim com '%c'", nome.charAt(0));

		}

		leitor.close();
	}
}
