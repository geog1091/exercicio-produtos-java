package Application;

import java.util.Scanner;

import Entities.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		Product produto = new Product();
		System.out.println("Bem-vindo ao sistema de estoque.");
		System.out.println("Insira o nome do produto:");
		produto.nome = sc.nextLine();
		System.out.println("Insira o preço do produto:");
		produto.preco = sc.nextDouble();
		System.out.println("Insira a quantidade do produto em estoque:");
		produto.quant = sc.nextInt();
		
		System.out.println("Informações do produto: " + produto);
		
		System.out.printf("\n\n Insira a quantidade que será adicionada ao estoque:\n");
		
		int quant = sc.nextInt();
		produto.adicionarProdutos(quant);
		
		System.out.println("Informações do produto (ATUALIZADO!!!): " + produto);
		
		System.out.printf("\n\n Insira a quantidade que será removida do estoque\nS");
		
		quant = sc.nextInt();
		produto.removerProdutos(quant);
		
		System.out.println("Informações do produto (ATUALIZADO!!! FINAL!!!): " + produto);
		
		sc.close();
	}

}
