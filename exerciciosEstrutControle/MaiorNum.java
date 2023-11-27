package exerciciosEstrutControle;

import java.util.Scanner;

public class MaiorNum {
	
	public static void main(String[] args) {
		
		int maior = 0;
		int menor = 0;
		
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.print("Digite o " + i + " valor: ");
			int valor = entrada.nextInt();
			if (i == 0) {
				maior = valor;
				menor = valor;
			} else if (valor > maior) {
				maior = valor;
			} else if (valor < menor){
				menor = valor;
			}
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		entrada.close();
	}
}

