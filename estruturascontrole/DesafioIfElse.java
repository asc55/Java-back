package estruturascontrole;

import java.util.Scanner;

public class DesafioIfElse {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		double nota = 0.0;
		double qtdnotas = 0;
		double somatorio = 0;		
		do {
			System.out.print("Digite uma nota válida: \n(-1 para sair..)");
			nota = entrada.nextDouble();
			boolean notaValida = (nota >= 0 && nota <= 10);
			if (notaValida) {
				qtdnotas++;
				somatorio += nota;
			}
		} while (nota != -1);
		
		double media = somatorio/qtdnotas;
		
		System.out.printf("Total de notas válidas: %i", qtdnotas);
		System.out.printf("Média de notas: &d", media);
		
		entrada.close();
	}
}
