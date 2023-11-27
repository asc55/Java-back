package classes;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		AreaCirc a2 = new AreaCirc(5);
		
		System.out.println(a1.Area());
		System.out.println(a2.Area());
		System.out.println(AreaCirc.area(100));
		
		System.out.println(AreaCirc.pi);
		System.out.println(Math.PI);
		
	}
}
