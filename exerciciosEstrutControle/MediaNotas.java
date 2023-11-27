package exerciciosEstrutControle;

import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[] args) {
		
		System.out.println("Cálculo da média");
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		double total = nota1 + nota2;
		double media = total/2;
		if (media >= 7) {
			System.out.println("Sua média foi " + media + " e você está Aprovado.");
		} else if (media >= 4) {
			System.out.println("Sua média foi " + media + " e você está de Recuperação.");
		} else {
			System.out.println("Sua média foi " + media + " e você está Reprovado.");
		}
		entrada.close();
	}
}
