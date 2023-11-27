package operadores;
import java.util.Scanner;
public class DesafioCalculadora {
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
				
		System.out.print("Agora o segundo: ");
		double num2 = entrada.nextDouble();
				
		System.out.println("Indique a operação: ");
		String op = entrada.next();
				
		double resultado = "+".equals(op)? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
				
		System.out.printf("%.2f %s %.2f = %.2f",
						num1, num2, op, resultado);
		entrada.close();
		
	}
}
