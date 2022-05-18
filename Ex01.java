package br.com.exercicios;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int n1, n2, resul;
	System.out.println("Digite o primeiro valor: ");
	n1 = scan.nextInt();
	System.out.println("Digite o segundo valor: ");
	n2 = scan.nextInt();
	
	resul = n1+n2;
	
	System.out.println("Soma: " + resul);
}
}
