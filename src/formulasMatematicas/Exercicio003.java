package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {
	// Valida se as notas estão dentro da faixa esperada
	private static boolean validarNotas(double nota1, double nota2, double nota3) {
		return nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10;
	}

	public static void main(String args[]) {
		// 3. Crie um programa que calcule e exiba a média aritmética de três notas
		// informadas pelo usuário.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 9). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite a primeira nota: ");
			double primeiraNota = leitor.nextDouble();

			System.out.print("Digite a segunda nota: ");
			double segundaNota = leitor.nextDouble();

			System.out.print("Digite a terceira nota: ");
			double terceiraNota = leitor.nextDouble();

			if (validarNotas(primeiraNota, segundaNota, terceiraNota)) {
				double media = (primeiraNota + segundaNota + terceiraNota) / 3;
				System.out.printf("Média: %.2f", media);
			} else {
				System.err.println("Erro: Insira notas válidas (entre 0 e 10).");
			}

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");

		}
	}
}
