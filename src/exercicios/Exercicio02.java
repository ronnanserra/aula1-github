package exercicios;

import java.util.Locale;
import java.util.Scanner;
//Exercício de fixação - Aula 18
public class Exercicio02 {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com seu nome completo:");
		String name = sc.nextLine();
		System.out.println("Quantos banheiros tem na sua casa?");
		int qtdBanheiro = sc.nextInt();
		System.out.println("Informe o valor do produto:");
		double vrProduto = sc.nextDouble();
		System.out.println("Informe seu último nome, idade e altura:");
		String name2 = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
	
		System.out.println(name);
		System.out.println(qtdBanheiro);
		System.out.printf("%.2f",vrProduto);
		System.out.println();
		System.out.println(name2);
		System.out.println(idade);
		System.out.printf("%.2f",altura);
		
		
		sc.close();
	}
}
