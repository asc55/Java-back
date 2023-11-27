package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat(" !!");
	// declaração, uso da var
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
	// método na própria declaração
		String y = "Bom dia Y"
				.replace("Y", "Gui")
				.toUpperCase()
				.concat(" !!");
		System.out.println(y);
	// Tipos primitivos não tem o método "."
		int a = 3;
		System.out.println(a);
	}
}
