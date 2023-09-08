package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio005 {
	public static void main(String[] args) {
		// 5. Escreva um programa que calcule o IMC de um indivíduo, utilizando a
		// fórmula IMC = peso / altura²

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 11). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite o peso (em kg): ");
			double peso = leitor.nextDouble();
			System.out.print("Digite a altura (em metros): ");
			double altura = leitor.nextDouble();

			double IMC = peso / Math.pow(altura, 2);

			System.out.printf("IMC: %.2f", IMC);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");

		}
	}
}
