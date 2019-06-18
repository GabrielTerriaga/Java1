package exercicioEntrada;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
	//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
	//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
	//decimais.	
		
		//Locale US
		Locale.setDefault(Locale.US);
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		int numEmployer;
		double numHourJob, valueByHour, payEmployer;
		
		//Entrada
		System.out.println("Controle de funcionario");
		System.out.println("Digite o numero de funcionarios na empresa:");
		numEmployer = sc.nextInt();
		System.out.println("Digite o numero de horas trabalhadas:");
		numHourJob = sc.nextDouble();
		System.out.println("Digite o valor do salario por hora:");
		valueByHour = sc.nextDouble();
		
		//Calculo
		payEmployer = valueByHour * numHourJob;
		
		//Saida
		System.out.println("Numero de funcionarios = " + numEmployer);
		System.out.printf("Salario = U$ %.2f", payEmployer);
		
		//Fecha Scanner
		sc.close();
	}

}
