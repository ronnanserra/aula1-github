package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;
// aula 46
public class Program {
	
	public static void main (String[] args) {
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os lados do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os lados do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		x.calcularArea();
		y.calcularArea();
				
		System.out.printf("Area do triangulo X: %.4f%n",x.area);
		System.out.printf("Area do triangulo Y: %.4f%n",y.area);
		
		if (x.area > y.area) {
			System.out.println("Area de X é maior.");
		}else {
			System.out.println("Area de Y é maior.");
		}
		
		sc.close();
		
	}

}
