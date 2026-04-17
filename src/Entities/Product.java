package Entities;

public class Product {
	public String nome; //nome do produto
	public double preco; // preço do produto
	public int quant; 	// quantidade do produto
	
	public double valorTotalNoEstoque () { //função que calcula o valor total dos produtos no estoque
		return preco*quant;
	}
	
	public void adicionarProdutos (int quant) { //função que adiciona produtos ao estoque
		this.quant += quant; //utilizei o mesmo nome da variavel quant para o parâmetro, diferenciando-as com "this"
	}
	
	public void removerProdutos (int quant) { // função que remove produtos do estoque
		this.quant -= quant;
	}
	
	public String toString() { //função toString configurada para imprimir como desejo
		return nome
			+ ", R$ "
			+ String.format("%.2f",preco)
			+ ", "
			+ quant
			+ " unidades, Total: R$ "
			+ String.format("%.2f", valorTotalNoEstoque());
	}
}
