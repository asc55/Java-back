package exerciciosEstrutControle;

import java.util.Random;
import java.util.Scanner;

public class AdivinhandoNum {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int sorteado = random.nextInt(100);
		System.out.println("Número sorteado!!");
		
		Scanner entrada = new Scanner(System.in);
		
		for (int cont = 9; cont > 0; cont--) {
			System.out.print("Digite seu palpite: ");
			int numero = entrada.nextInt();
			if (numero > sorteado) {
				System.out.println("O seu palpite é maior que o número sorteado..");
			} else if (numero < sorteado) {
				System.out.println("O seu palpite é menor que o número sorteado..");
			} if (numero != sorteado) {
				System.out.println("Não foi dessa vez");
				System.out.println("Restam " + cont + " tentantivas" );
			} else {
				System.out.println("Parabéns!");
				System.out.println("Sorteado: " + sorteado);
				break;
			} 
		}
		entrada.close();
	}
}
