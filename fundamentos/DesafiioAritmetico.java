package fundamentos;

public class DesafiioAritmetico {
	
	public static void main(String[] args) {
		
		double numeradorA = Math.pow(6 * (3 + 2), 2);
		double denominadorA = 3 * 2;
		double superiorA = numeradorA / denominadorA;
		
		double numeradorB = (1 - 5) * (2 - 7);
		double denominadorB = 2;
		double superiorB = Math.pow(numeradorB/denominadorB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		double resultado = superior / inferior;
		
		System.out.println("Resultado: " + resultado);
		/*
		 * int a = 6 * (3 + 2); int numA = (int)Math.pow(a, 2); int denA = 3 * 2; int
		 * supA = numA / denA;
		 * 
		 * int numB = (1 - 5) * (2 - 7); int e = numB / 2; int supB = (int) Math.pow(e,
		 * 2); int z = supA - supB; int superior = (int) Math.pow(z, 3); int inferior =
		 * (int) Math.pow(10, 3);
		 * 
		 * int resultado = superior / inferior; System.out.println("Resultado: " +
		 * resultado);
		 */
	}
}
