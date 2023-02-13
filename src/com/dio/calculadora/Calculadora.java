package com.dio.calculadora;

import java.util.Scanner;//import para conseguir usar o Scanner

public class Calculadora {

	public static void main(String[] args) {
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite outro valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int sub = sub(a,b);
		int mult = mult(a,b);
		
		System.out.println("Valor de soma: " + soma);
		System.out.println("Valor de subtração: " + sub);
		System.out.println("Valor de multiplicação: " + mult);
		
	}
	public static int soma(int a , int b) {
		return a + b;
	}
	public static int sub(int a , int b) {
		return a - b;
	}
	public static int mult(int a , int b) {
		return a * b;
	}

}
