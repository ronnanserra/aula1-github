package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program75 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ronnan");
		list.add("Bianca");
		list.add("Lidia");
		list.add("Grasiely");
		list.add("Simone");
		list.add("Mariana");
		
		for (String x : list) {
			System.out.println(x);
			
		}
		
		System.out.println("---------------");
		
		list.add(2,"Sofia");
		
		for (String x : list) {
			System.out.println(x);
			
		}
		
		System.out.println("---------------");
		
		System.out.println(list.size());
		
		System.out.println("---------------");
		
		list.remove("Grasiely");
		
		for (String x : list) {
			System.out.println(x);
			
		}
		
		System.out.println("---------------");
		
		list.remove(2);
		
		for (String x : list) {
			System.out.println(x);
			
		}
		
		System.out.println("---------------");
		
		list.removeIf(x -> x.charAt(1) == 'i');
		
		for (String x : list) {
			System.out.println(x);
			
		}
		
		System.out.println("---------------");
		
		System.out.println("Index of Mariana: "+ list.indexOf("Mariana"));
		System.out.println("Index of Mariana: "+ list.indexOf("Olivia"));
		
		System.out.println("---------------");
		
		list.add("Bianca");
		list.add("Lidia");
		list.add("Simone");
				
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList()); // nesse comando eu converto a lista para stream, faço o filtro e depois converto para lista novament com o comando ".collect"
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		
		String name =  list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
		name =  list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
