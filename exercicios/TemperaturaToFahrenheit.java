package exercicios;

import java.util.Scanner;

public class TemperaturaToFahrenheit {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius: ");
		
		double celsius = entrada.nextDouble();
		double fahrenheit = celsius * 1.8 + 32;
		
		System.out.printf("A mesma temperatura de: %.2f Celsius \n em Fahrenheit é: %.2f",
				celsius, fahrenheit);
		entrada.close();
	}
}
