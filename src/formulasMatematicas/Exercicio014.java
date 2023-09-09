package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio014 {
	public static void main(String[] args) {
		// 14. Escreva um programa que leia a posição x e y de dois pontos no plano
		// cartesiano, e calcule a distância entre ambos.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 21). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Ponto 1 posição X (metros): ");
			double posicaoX1 = leitor.nextDouble();
			System.out.print("Ponto 1 posição Y (metros): ");
			double posicaoY1 = leitor.nextDouble();

			System.out.print("Ponto 2 posição X (metros): ");
			double posicaoX2 = leitor.nextDouble();
			System.out.print("Ponto 2 posição Y (metros): ");
			double posicaoY2 = leitor.nextDouble();

			double primeiraHipotenusa = Math.sqrt((Math.pow(posicaoX1, 2) + Math.pow(posicaoY1, 2)));
			double segundaHipotenusa = Math.sqrt((Math.pow(posicaoX2, 2) + Math.pow(posicaoY2, 2)));

			System.out.printf("Distância entre X1 e Y1: %.2f metros%n", primeiraHipotenusa);
			System.out.printf("Distância entre X2 e Y2: %.2f metros%n", segundaHipotenusa);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
