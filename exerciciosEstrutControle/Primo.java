package exerciciosEstrutControle;

import java.util.Scanner;

public class Primo {
	
	public static void main(String[] args) {
		
		System.out.println("Cálculo do número PRIMO");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número: ");
		int num = entrada.nextInt();
		int div = 0;
		
		for (int cont = num ; cont < num; cont--) {
			if (num % cont == 0) {
				div++;
			}
		}
		if (div == 2) {
			System.out.println(num + " é um número primo!!");
		} else {
			System.out.println(num + " não é um número primo!!");
		}
		entrada.close();
	}
}

