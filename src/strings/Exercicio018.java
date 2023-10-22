package strings;

import java.util.Scanner;

public class Exercicio018 {

	public static void main(String[] args) {
		// 18. Crie um programa que receba uma frase e substitua todas as letras "a" por
		// "e". Utilizando Replace

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 25). Kindle Edition.

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite algo: ");
		String frase = leitor.nextLine();

		System.out.println(frase.replace('a', 'e'));

		leitor.close();

	}

}
