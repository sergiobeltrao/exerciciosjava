package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio010 {
	public static void main(String[] args) {
		// 10. Escreva um programa que calcule o perímetro e a área de um triângulo,
		// utilizando as fórmulas P = a + b + c e A = (b * h) / 2, onde a, b e c são os
		// lados do triângulo e h é a altura relativa ao lado b.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 16). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.println("Digite as seguinte informações relacionadas ao triângulo (em cm)");
			System.out.print("Tamanho do lado A: ");
			double ladoA = leitor.nextDouble();
			System.out.print("Tamanho do lado B: ");
			double ladoB = leitor.nextDouble();
			System.out.print("Tamanho do lado C: ");
			double ladoC = leitor.nextDouble();
			System.out.print("Altura H relativa ao lado B: ");
			double alturaH = leitor.nextDouble();

			double perimetro = ladoA + ladoB + ladoC;
			double area = (ladoB * alturaH) / 2;

			System.out.printf("O perímetro é igual a %.2f cm e a área é igual a %.2f cm", perimetro, area);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
