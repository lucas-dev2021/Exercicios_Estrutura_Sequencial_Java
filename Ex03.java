package br.com.exercicios;

import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int A,B,C,D,DIFERENCA;
	
	System.out.println("Digite o valor de A:");
	A = scan.nextInt();
	
	System.out.println("Digite o valor de B:");
	B = scan.nextInt();
	
	System.out.println("Digite o valor de C:");
	C = scan.nextInt();
	
	System.out.println("Digite o valor de D:");
	D = scan.nextInt();
	
	DIFERENCA = (A * B - C * D);
	
	System.out.println("DIFERENÇA" + DIFERENCA);
	
	
}
}
