package exercicios;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a temperatura em Fahrenheit: ");
		
		double fahrenheit = entrada.nextDouble();
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.printf("A mesma temperatura de: %.2f Fahrenheit \n em Celsius é: %.2f",
				fahrenheit, celsius);
		entrada.close();
	}
}
