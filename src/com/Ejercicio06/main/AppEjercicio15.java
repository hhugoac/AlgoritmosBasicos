package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio15 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int iNum;
		int i;
		String sCadena=" ";
		
		System.out.println("Ingresar una cadena: ");
		sCadena=entrada.next();

		System.out.println("Ingresar un numero: ");
		iNum=entrada.nextInt();		
		
		// Ciclo for
		for(i=0;i<iNum;i++)
		{
			System.out.println(sCadena);
		}	
		
		//Ciclo while
		i=1;
		while(i<=iNum)
		{
			System.out.println(sCadena);
			i++;
		}
		
		i=1;
		do
		{
			System.out.println(sCadena);
			i++;
		}while(i<=iNum);
	}

}
