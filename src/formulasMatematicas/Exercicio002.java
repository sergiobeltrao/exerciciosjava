package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio002 {
	public static void main(String[] args) {
		// 2. Escreva um programa que calcule a média aritmética de dois números.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 8). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite o primeiro número: ");
			double primeiroNumero = leitor.nextDouble();
			System.out.print("Digite o segundo número: ");
			double segundoNumero = leitor.nextDouble();

			double media = (primeiroNumero + segundoNumero) / 2;

			System.out.printf("Média: %.2f", media);

		} catch (Exception e) {
			System.err.println(
					"Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}

	}
}
