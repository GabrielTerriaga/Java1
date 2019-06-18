package exercicioEntrada;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
	//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
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
