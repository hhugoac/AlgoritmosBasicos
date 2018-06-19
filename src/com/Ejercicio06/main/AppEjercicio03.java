package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio03 {

	public static void main(String[] args) {
		int iBase=0;
		int iAltura=0;
		double iArea=0;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dar la altura:");
		iAltura=entrada.nextInt();
		
		System.out.println("Dar la base:");
		iBase=entrada.nextInt();
		
		iArea=iBase*iAltura/2;
		System.out.println("El area es: "+iArea);
	}

}
