package br.com.exercicios;

import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int cd1, cd2, qt1, qt2;
	double vl1, vl2, prod1, prod2;
	double total;
	//Produto 1
	System.out.println("Digite código produto 1: ");
	cd1 = scan.nextInt();
	System.out.println("Digite número de preças do produto 1:");
	qt1 = scan.nextInt();
	System.out.println("Digite valor do produto 1:");
	vl1 = scan.nextDouble();
	
	prod1 = (int)qt1 * vl1;
	
	//Produto 2
	System.out.println("Digite código produto 2: ");
	cd2 = scan.nextInt();
	System.out.println("Digite número de preças do produto 2:");
	qt2 = scan.nextInt();
	System.out.println("Digite valor do produto 2:");
	vl2 = scan.nextDouble();
	
	prod2 = (int)qt2 * vl2;
	
	total = prod1 + prod2;
	
	System.out.printf("VALOR A PAGAR: %.2f", total);
	
	
}
}
