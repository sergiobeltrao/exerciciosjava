package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio008 {
	public static void main(String[] args) {
		// 8. Escreva um programa que calcule o delta de uma equação de segundo grau
		// (Δ = b² - 4ac).

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 14). Kindle Edition.

		Locale.setDefault(new Locale("BR"));

		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite o valor de a: ");
			double valorDeA = leitor.nextDouble();
			System.out.print("Digite o valor de b: ");
			double valorDeB = leitor.nextDouble();
			System.out.print("Digite o valor de c: ");
			double valorDeC = leitor.nextDouble();

			double delta = Math.pow(valorDeB, 2) - 4 * valorDeA * valorDeC;

			System.out.printf("Delta: %.2f", delta);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
