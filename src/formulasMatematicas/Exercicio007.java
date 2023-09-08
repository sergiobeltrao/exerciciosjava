package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio007 {
	public static void main(String[] args) {
		// 7. Escreva um programa que calcule a área de um círculo a partir do raio,
		// utilizando a fórmula A = πr²

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 13). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite o valor do raio: ");
			double raio = leitor.nextDouble();

			double areaDoCirculo = Math.PI * Math.pow(raio, 2);

			System.out.printf("A área do círculo: %.2f", areaDoCirculo);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}

	}

}
