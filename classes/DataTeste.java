package classes;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.imprimirData();
		d1.ano = 2021;
		var d2 = new Data(31, 12, 2000);
		
		var d3 = new Data();
		
		String dataFormatada1 = d1.obterData();
		System.out.println(dataFormatada1);
		
		System.out.println(d2.obterData());
	
		d1.imprimirData();
		d2.imprimirData();
		d3.imprimirData();
	}
}
