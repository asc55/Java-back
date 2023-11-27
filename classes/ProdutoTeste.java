package classes;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
	
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		//alteração de todos os descontos de todos os produtos
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		double media = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("Média do carinho: R$%.2f.", media);
		
	}
}
