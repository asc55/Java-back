package exerciciosEstrutControle;

import java.util.Scanner;

public class NumPrimocomSwitch {
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("\nO numero " + numero + " é primo.");
			break;
		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");
		}
		scanner.close();
	}
}
