package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio012 {
	public static void main(String[] args) {
		// 12. Escreva um programa que calcule a energia cinética de um objeto em
		// movimento, utilizando a fórmula E = (mv²) / 2, onde E é a energia cinética, m
		// é a massa do objeto e v é a velocidade.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 19). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Massa (kg): ");
			double massa = leitor.nextDouble();
			System.out.print("Velocidade (m/s): ");
			double velocidade = leitor.nextDouble();

			double energiaCinetica = (massa * Math.pow(velocidade, 2)) / 2;

			System.out.printf("Energia cinética: %.2f J", energiaCinetica);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
