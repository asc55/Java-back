package fundamentos;

import java.util.Scanner;

public class DesafioStringtoNumber {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o antepenúltimo salário: ");
		String valor1 = entrada.next().replace(",", ".");
		System.out.println("Digite o penúltimo salário: ");
		String valor2 = entrada.next().replace(",", ".");
		System.out.println("Digite o último salário: ");
		String valor3 = entrada.next().replace(",", ".");
		
		//float salario1 = Integer.parseInt(valor1); 
		//float salario2 = Integer.parseInt(valor2); 
		//float salario3 = Integer.parseInt(valor3); 
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		double media = (salario1 + salario2 + salario3)/3;
		//float media = (salario1 + salario2 + salario3)/3;
		System.out.println("A média dos três salários: " + media);
		
		entrada.close();
	}
}
