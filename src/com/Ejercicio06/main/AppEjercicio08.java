package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio08 {

	public static void main(String[] args) 
	{
		// Inicio de las variables 
		int i;
		
		// Ciclo for
		for(i=50;i>=1;i--)
		{
			System.out.println(i);
		}		
		
		// Ciclo while
		i=50;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
		// Ciclo do...while
		
		i=50;
		do
		{
			System.out.println(i);
			i--;
		}while(i>=1);		
	}

}
