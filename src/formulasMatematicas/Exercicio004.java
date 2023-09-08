package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio004 {
	// Calcula a média geométrica de três valores
	private static double mediaGeometrica(double numero1, double numero2, double numero3) {
		return Math.cbrt(numero1 * numero2 * numero3);
	}

	public static void main(String[] args) {
		// 4. Escreva um programa que calcule a média geométrica entre três números
		// informados pelo usuário

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 10). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite o primeiro número: ");
			double primeiroValor = leitor.nextDouble();
			System.out.print("Digite o segundo número: ");
			double segundoValor = leitor.nextDouble();
			System.out.print("Digite o terceiro número: ");
			double terceiroValor = leitor.nextDouble();

			System.out.printf("Média geométrica: %.2f", mediaGeometrica(primeiroValor, segundoValor, terceiroValor));
		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
