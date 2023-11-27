package classes;

public class PrimeiroTrauma {
	
	int a = 3; // não pode mexer aqui! (atributo da instancia)
	static int b = 4; //membro estatico, membro de classe
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		//criar uma instancia para acessar um membro de instancia
		System.out.println(b);
	}
}
