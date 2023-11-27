package estruturascontrole;

import java.util.Scanner;

public class DesafioNotas1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidade = 0;
		double total = 0.0;
		double nota = 0.0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 p/sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidade++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!");
			}
		}
		//Cálculo da média
				double media = total / quantidade;
				System.out.println("Média = " + media);
				System.out.println("A quantidade de notas: " + quantidade);
				System.out.println("O total de notas: " + total);
				
		entrada.close();
	}
}
