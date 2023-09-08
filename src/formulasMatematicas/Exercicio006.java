package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		// 6. Crie um programa que calcule e exiba o perímetro de um círculo,
		// solicitando o raio ao usuário.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 12). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite o raio do cícrulo (em metros): ");
			double raioDoCirculo = leitor.nextDouble();

			double perimetroDoCirculo = 2 * Math.PI * raioDoCirculo;

			System.out.printf("Perímetro: %.2f metros", perimetroDoCirculo);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}

	}

}
