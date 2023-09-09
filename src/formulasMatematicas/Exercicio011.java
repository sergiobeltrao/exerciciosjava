package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio011 {
	public static void main(String[] args) {
		// 11. Escreva um programa que calcule a velocidade média de um objeto,
		// utilizando a fórmula v = Δs/Δt, onde v é a velocidade média, Δs é a variação
		// de espaço e Δt é a variação de tempo

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 18). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Distância inicial (metros): ");
			double distanciaInicial = leitor.nextDouble();
			System.out.print("Distância final (metros): ");
			double distanciaFinal = leitor.nextDouble();

			System.out.print("Tempo inicial (segundos): ");
			double tempoInicial = leitor.nextDouble();
			System.out.print("Tempo final (segundos): ");
			double tempoFinal = leitor.nextDouble();

			double velocidadeMedia = (distanciaFinal - distanciaInicial) / (tempoFinal - tempoInicial);

			System.out.printf("Velocidade média: %.2f m/s", velocidadeMedia);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
