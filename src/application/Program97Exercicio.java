package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.ContratoHora;
import entidade.Departamento;
import entidade.Trabalhador;
import entidade.enums.NivelTrabalhador;

public class Program97Exercicio {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Informe os dados do trabalhador:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nível:");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Base Salarial:");
		Double baseSalarial = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nome,NivelTrabalhador.valueOf(nivelTrabalhador),baseSalarial,new Departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos desse trabalhador?");
		Integer quantidade = sc.nextInt();
		
		for (int i = 1;i <= quantidade; i++) {
			System.out.println("Cadastrar dados do contrato #"+i+":");
			System.out.print("Data (DD/MM/AAAA):");
			Date data = dateFormat.parse(sc.next());
			System.out.print("Valor por hora:");
			Double valor = sc.nextDouble();
			System.out.print("Duração:");
			Integer horas = sc.nextInt();
			
			ContratoHora contrato = new ContratoHora(data,valor,horas);
			trabalhador.addContrato(contrato);
			
		}
		
		System.out.print("Informe o mês/ano para consultar receita (MM/AAAA):");
		String dataConsulta = sc.next();
		Integer mes = Integer.parseInt(dataConsulta.substring(0,2));
		Integer ano = Integer.parseInt(dataConsulta.substring(3));
		System.out.println("Nome:" + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Receita em "+dataConsulta+": "+ String.format("%.2f", trabalhador.rendaMes(mes, ano)));
		
		sc.close();
		
	}
	
}
