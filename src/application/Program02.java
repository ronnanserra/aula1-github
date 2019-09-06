package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

//a partir da aula 47
public class Program02 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto:");
		System.out.printf("Nome: ");
		String nome = sc.nextLine();
		System.out.printf("Preço: ");
		double preco = sc.nextDouble();
		//System.out.printf("Quantidade: ");
		//int quantidade = sc.nextInt();
		
		Produto p = new Produto(nome, preco);
		
		System.out.println();
		System.out.println("Dados do produto: " + p); 
		
		System.out.println();
		System.out.printf("Entre a quantidade de produtos para adicionar em estoque: ");
		p.addProduto(sc.nextInt());
		
		System.out.println();
		System.out.println("Dados do produto: " + p);
		
		System.out.println();
		System.out.printf("Entre a quantidade de produtos para remover do estoque: ");
		p.removerProduto(sc.nextInt());
		
		System.out.println();
		System.out.println("Dados do produto: " + p);
		
		sc.close();

	}
	
	
}
