package exerciciosEstrutControle;

import java.util.Scanner;

public class primeiroExerc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número a ser consultado: ");
		int numero = entrada.nextInt();
		if (numero >= 0 && numero <=10 ) {
			System.out.print("O número digitado se encontra no intervalo descrito..[0..10]");
		} else {
			System.out.print("O número digitado não se encontra no intervalo descrito, infelizmente..");
		}
		System.out.println();
		if (numero % 2 == 0) {
			System.out.print("O número digitado é PAR");
		} else {
			System.out.println("O número digitado é IMPAR");
		}
		entrada.close();
	}
}
