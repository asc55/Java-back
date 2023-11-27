package fundamentos;

import java.util.Scanner;

public class TesteConsole {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.println(" dia!\n\n");
		
		System.out.printf("Mega Sena: %d %d %d %d %d %d %n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: R$%.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n","João");
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos de idade.",
				nome, sobrenome, idade);
		
		
		entrada.close();
	}
}
