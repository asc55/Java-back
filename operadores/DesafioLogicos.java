package operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		
		boolean maisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou uma TV de 50?" + comprouTv50);
		System.out.println("Comprou uma TV de 32?" + comprouTv32);
		System.out.println("Tomou sorvete? " + tomouSorvete);
		System.out.println("Mais saudavel? " + maisSaudavel);
	}
}
