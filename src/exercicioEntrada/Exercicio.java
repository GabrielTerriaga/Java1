package exercicioEntrada;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		//Alterar ortografia para US
		Locale.setDefault(Locale.US);
		
		//Obj para entrada de dados
		Scanner sc = new Scanner(System.in);
		
		//Variaveis globais com Entrada de dados
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int numberBedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String lName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		//Saida de dados
		System.out.println(name);
		System.out.println(numberBedrooms);
		System.out.printf("%.2f%n",price);
		System.out.println(lName);
		System.out.println(age);
		System.out.println(height);
		sc.close();
	}

}
