package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {
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

			double media = (primeiraNota + segundaNota + terceiraNota) / 3;

			System.out.printf("Média: %.2f", media);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");

		}
	}
}
