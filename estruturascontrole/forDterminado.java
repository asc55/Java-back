package estruturascontrole;

public class forDterminado {
	
	public static void main(String[] args) {
		for (int contador = 0; contador <= 20; contador += 2) {
			System.out.printf("i = %d\n", contador);
		}
	}
}
//int contador = 0;
//while (contador <= 20) {
//	System.out.printf("i = %d\n", contador);
//	contador +=2;
//}
//observe como o for pode diminuir a quantidade de linhas de código
