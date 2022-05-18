package br.com.exercicios;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;
		double numero = 0;
		double raio;
		double area;

		System.out.println("Digite o raio do circulo: ");
		numero = scan.nextDouble();
		raio = Math.pow(numero, 2);
		area = raio*pi;
		
		System.out.printf("A area do circulo é: %.4f", area);
		
		

	}
}
