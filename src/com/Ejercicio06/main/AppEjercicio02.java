package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio02 {

	public static void main(String[] args) {
		int iEdad=0;
		int iRes=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dar tu año de nacimiento: ");
		iEdad=entrada.nextInt();
		
		iRes=2018-iEdad;
		System.out.println("Tu edad es "+iRes);
	}

}
