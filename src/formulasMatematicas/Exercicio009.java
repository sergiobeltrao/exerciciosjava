package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio009 {
	public static void main(String[] args) {
		// 9. Escreva um programa que calcule o perímetro e a área de um retângulo,
		// utilizando as fórmulas P = 2(l + c) e A = lc, onde l é a largura e c é o
		// comprimento

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 15). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			System.out.print("Digite o comprimento: ");
			double comprimento = leitor.nextDouble();
			System.out.print("Digite a largura: ");
			double largura = leitor.nextDouble();

			double perimetro = 2 * (largura + comprimento);
			double area = largura * comprimento;

			System.out.printf("Perímetro: %.2f%n", perimetro);
			System.out.printf("Área: %.2f%n", area);

		} catch (Exception e) {
			System.err.println("Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}

}
