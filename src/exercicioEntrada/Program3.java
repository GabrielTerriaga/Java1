package exercicioEntrada;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
	//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
	//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		//Variaveis
		int A, B, C, D, diferenca;
		
		//Entrada com Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos mostrar a diferença desses numeros... sei la mano, nem eu entendi...");
		System.out.println("Digite A:");
		A = sc.nextInt();
		System.out.println("Digite B:");
		B = sc.nextInt();
		System.out.println("Digite C:");
		C = sc.nextInt();
		System.out.println("Digite D:");
		D = sc.nextInt();
		
		//Calculo da diferença
		diferenca = A * B - C * D;
		
		//Saida
		System.out.println("DIFERENCA = " + diferenca);
		
		//Fecha scanner
		sc.close();
		
	}

}
