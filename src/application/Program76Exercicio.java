package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;

public class Program76Exercicio {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		List<Empregado> list = new ArrayList<>();
		
		System.out.printf("Quantos empregados você irá registrar?");
		int quantidadeCadastro = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < quantidadeCadastro; i++) {
			System.out.printf("Empregado #%d:", i);
			System.out.println();
			System.out.printf("Id: ");
			int id = sc.nextInt();
			System.out.printf("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.printf("Salário: ");
			double salario = sc.nextDouble();
			
			list.add(new Empregado(id,nome,salario));
		}
		
		System.out.println();
		
		System.out.printf("Entre com o Id do empregrado que receberá o aumento: ");
		
		int id = sc.nextInt();
		
		Empregado emp =  list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("Este id não existe!");
		}else {
			System.out.printf("Entre com a porcentagem do aumento: ");
			double percentualAumento = sc.nextDouble();
			emp.aumentarSalario(percentualAumento);
		}
		
		System.out.println();
		
		System.out.println("Lista de Empregados: ");
		for (Empregado obj: list) {
			System.out.printf("%d, %s, %.2f %n", obj.getId(), obj.getNome(), obj.getSalario());
		}
		
		sc.close();
		
	}

}
