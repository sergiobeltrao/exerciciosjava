package formulasMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio001 {
	public static void main(String[] args) {
		// 1. Escreva um programa que solicite ao usuário dois números e exiba a soma,
		// subtração, multiplicação e divisão entre eles.

		// Referência: Conceição, Ruhan. Dominando Java: 100+ Exercícios Resolvidos e
		// Comentados para Acelerar seu Aprendizado (p. 7). Kindle Edition.

		Locale.setDefault(new Locale("BR"));
		try (Scanner leitor = new Scanner(System.in)) {

			double primeiroNumero, segundoNumero;

			System.out.print("Digite o primeiro número: ");
			primeiroNumero = leitor.nextDouble();

			System.out.print("Digite o segundo número: ");
			segundoNumero = leitor.nextDouble();

			double soma = primeiroNumero + segundoNumero;
			double subtracao = primeiroNumero - segundoNumero;
			double multiplicacao = primeiroNumero * segundoNumero;
			double divisao = primeiroNumero / segundoNumero;

			System.out.println();
			System.out.printf("Adição: %.2f + %.2f = %.2f%n", primeiroNumero, segundoNumero, soma);
			System.out.printf("Subtração: %.2f - %.2f = %.2f%n", primeiroNumero, segundoNumero, subtracao);
			System.out.printf("Multiplicação: %.2f * %.2f = %.2f%n", primeiroNumero, segundoNumero, multiplicacao);
			System.out.printf("Divisão: %.2f / %.2f = %.2f%n", primeiroNumero, segundoNumero, divisao);

		} catch (Exception e) {
			System.err.println(
					"Erro: Insira números válidos. Use a vírgula para separar números de ponto flutuante.");
		}
	}
}
