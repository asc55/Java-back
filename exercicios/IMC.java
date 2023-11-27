package exercicios;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o peso: [kg]");
		double peso = entrada.nextDouble();
		System.out.println("Digite sua altura: [m] ");
		double altura = entrada.nextDouble();
		double imc = peso / (Math.pow(altura, 2));
		String resultado = imc < 16 ? "Magreza Grave" : "IMC " + imc;
		resultado = imc < 17 ? "Magreza Moderada" : resultado;
		resultado = imc < 18.5 ? "Magreza Leve" : resultado;
		resultado = imc < 25 ? "Peso IDEAL!!" : resultado;
		resultado = imc < 30 ? "Sobrepeso" : resultado;
		resultado = imc < 35 ? "Obesidade grau I" : resultado;
		resultado = imc < 40 ? "Obesidade grau II" : resultado;
		resultado = imc > 40 ? "Obesidade Severa": resultado;
				
		System.out.println(resultado);
		entrada.close();
	}
}
