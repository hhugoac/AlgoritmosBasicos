package com.Ejercicio06.main;

import java.util.Scanner;

public class AppEjercicio10a {

	public static void main(String[] args) 
	{
		// Inicio de las variables 
		int i;
		int a;
		int b;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dar un valor inicial");
		a=entrada.nextInt();
		
		System.out.println("Dar un valor final");
		b=entrada.nextInt();
		
				
		// Ciclo for
		for(i=a;i<=b;i++) //Dos en dos
		{
			System.out.println(i);
		}		
		
		for(i=a;i<=b;i+=3) //Tres en tres
		{
			System.out.println(i);
		}
		
		for(i=a;i<=b;i+=5) //Cinco en cinco 
		{
			System.out.println(i);
		}
		
		
		// Ciclo while
		i=a;
		while(i<=b)
		{
			System.out.println(i);
			i++;
		}
		
		i=a;
		while(i<=b)
		{
			System.out.println(i);
			i+=5;
		}
		
		i=a;
		while(i<=b)
		{
			System.out.println(i);
			i+=5;
		}
		// Ciclo do...while
		
		i=a;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=b);
		
		i=a;
		do
		{
			System.out.println(i);
			i+=3;
		}while(i<=b);		
		
		i=a;
		do
		{
			System.out.println(i);
			i+=5;
		}while(i<=b);
	}

}
