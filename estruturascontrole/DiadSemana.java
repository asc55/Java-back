package estruturascontrole;

import java.util.Scanner;

public class DiadSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia: ");
		String dia = entrada.next();
		if (dia.equalsIgnoreCase("domingo")){
			System.out.printf("Dia: 1");
		} else if ("segunda".equals(dia.toLowerCase())){
				System.out.println("Dia: 2");
		} else if (dia.equalsIgnoreCase("terça")
				|| "terça".equalsIgnoreCase(dia)){
				System.out.println("Dia: 3");
		} else if (dia.equalsIgnoreCase("quarta")){
				System.out.println("Dia: 4");
		} else if (dia.equalsIgnoreCase("quinta")){
				System.out.println("Dia: 5");
		} else if (dia.equalsIgnoreCase("sexta")){
				System.out.println("Dia: 6");
		} else if ("sabado".equalsIgnoreCase(dia)){
				System.out.println("Dia: 7");
		}

		entrada.close();
	}
}