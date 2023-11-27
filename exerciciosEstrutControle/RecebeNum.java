package exerciciosEstrutControle;

import java.util.Scanner;

public class RecebeNum {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int somatorio = 0;
		
		while (num >= 0) {
			System.out.print("Digite um número positivo: ");
			num = entrada.nextInt();
			if (num >= 0) {
				somatorio += num;
				System.out.println("Soma até o momento: " + somatorio);
			}
		}
		entrada.close();
	}
}	
