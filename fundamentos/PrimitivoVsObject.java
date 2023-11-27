package fundamentos;

public class PrimitivoVsObject {
	
	public static void main(String[] args) {
			
		String s = new String("texto");
		s.toUpperCase();
		System.out.println(s);
		System.out.println(s.toUpperCase());
		//Wrappers são a versão objeto dos tipos primitivos
	}
}
