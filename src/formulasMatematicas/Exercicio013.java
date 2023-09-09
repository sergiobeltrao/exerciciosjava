package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio013 {
	public static void main(String[] args) {
		// 13. Escreva um programa que calcule o trabalho realizado por uma força que
		// atua sobre um objeto, utilizando a fórmula T = F * d, onde T é o trabalho, F
		// é a força aplicada e d é a distância percorrida pelo objeto.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 20). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Força (N): ");
			double forca = leitor.nextDouble();

			System.out.print("Deslocamento (m): ");
			double distancia = leitor.nextDouble();

			double trabalho = forca * distancia;

			System.out.printf("Trabalho realizado %.2f J", trabalho);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
