package exercicios;

import java.util.Scanner;

public class CuboQuadrado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");
		double num = entrada.nextDouble();
		double quadrado = Math.pow(num, 2); // num * num
		double cubo = Math.pow(num, 3); // num * num * num
		
		System.out.printf("O número digitado ao quadrado: %.2f", quadrado);
		System.out.printf("\nO número digitado ao cubo:  %.2f", cubo);
		entrada.close();
	}
}
