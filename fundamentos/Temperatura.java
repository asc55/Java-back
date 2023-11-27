package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double fahrenheit = 86;
		final double MULTIPLICADOR = 5.0/9.0;
		final double FATOR = 32;
		double temperatura = (fahrenheit - FATOR) * MULTIPLICADOR;
		System.out.println("A temperatura em C = " + temperatura);
		
		fahrenheit = 150;
		temperatura = (fahrenheit - FATOR) * MULTIPLICADOR;
		System.out.println("A temperatura em C = " + temperatura);
	}
}
