package exercicioEntrada;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
	//casas decimais conforme exemplos.
	//F�rmula da �rea: area = pi . raio2
	//Considere o valor de pi = 3.14159

		//Locale US
		Locale.setDefault(Locale.US);
		
		//Entrada  com Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variaveis
		double num, raio, pi;
		
		System.out.println("Vamos calcular o raio de um circulo");
		System.out.println();
		System.out.println("Digite a area do raio do circulo: ");
		num = sc.nextDouble();
		System.out.println();
		pi = 3.14159;
		raio = pi * (num*num);
		
		System.out.printf("A=%.4f", raio);
		sc.close();
	}

}
