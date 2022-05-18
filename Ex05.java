package br.com.exercicios;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	Double A,B,C, area;
	Double pi = 3.14159;
	Double triangulo, circulo, trapezio, quadrado, retangulo;
	
	System.out.println("Digite A:");
	A = scan.nextDouble();
	System.out.println("Digite B:");
	B = scan.nextDouble();
	System.out.println("Digite C:");
	C = scan.nextDouble();
	
	triangulo = A*C/2;
	area = Math.pow(C, 2);
	circulo = pi*area;
	trapezio = A+B*C/2;
	quadrado = Math.pow(B, 2);
	retangulo = A*B;
	
	System.out.printf("TRIANGULO: %.3f %n", triangulo);
	System.out.printf("CIRCULO: %.3f %n", circulo);
	System.out.printf("TRAPEZIO: %.3f %n", trapezio);
	System.out.printf("QUADRADO: %.3f %n", quadrado);
	System.out.printf("RETANGULO: %.3f %n", retangulo);
	
	
	
	
	
}
}
