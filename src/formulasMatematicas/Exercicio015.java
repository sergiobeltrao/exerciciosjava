package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio015 {
	public static void main(String[] args) {
		// 15. Crie um programa que solicite ao usuário o valor do raio de uma esfera e
		// calcule e exiba o seu volume.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 22). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Raio da esfera (metros): ");
			double raioDaEsfera = leitor.nextDouble();

			double volumeDaEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raioDaEsfera, 3);

			System.out.printf("Volume da esfera: %.2f metros³", volumeDaEsfera);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}

	}
}
