package estruturascontrole;

import java.util.Scanner;

public class TestIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a média: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado!!");
			System.out.println("Parabéns!!");
		}
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado!!");
		}
		entrada.close();
	}
}
