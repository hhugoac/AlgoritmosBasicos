package com.Ejercicio06.main;

import java.util.Scanner;

public class AppEjercicio01 {

	public static void main(String[] args) 
	{
		// Suma de dos numeros
		int iNum1=0;
		int iNum2=0;
		int iRes=0;
		
		Scanner entrada =new Scanner(System.in); //aqui puede ir teclado en lugar de entrada
		
		System.out.println("Dame un numero:");
		iNum1=entrada.nextInt();
		
		System.out.println("Dame un numero:");
		iNum2=entrada.nextInt();
		
		iRes=iNum1+iNum2;
		System.out.println("El resultado es: "+iRes);
	}

}
