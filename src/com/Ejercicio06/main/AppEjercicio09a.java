package com.Ejercicio06.main;

public class AppEjercicio09a {

	public static void main(String[] args) 
	{
		// Inicio de las variables 
		int i;
		
		// Ciclo for
		for(i=0;i<=1000;i=i+2) //Dos en dos
		{
			System.out.println(i);
		}		
		
		for(i=0;i<=1000;i=i+3) //Tres en tres
		{
			System.out.println(i);
		}
		
		for(i=0;i<=1000;i=i+5) //Cinco en cinco 
		{
			System.out.println(i);
		}
		
		
		// Ciclo while
		i=1;
		while(i<=1000)
		{
			System.out.println(i);
			i+=2;
		}
		
		i=1;
		while(i<=1000)
		{
			System.out.println(i);
			i+=3;
		}
		
		i=1;
		while(i<=1000)
		{
			System.out.println(i);
			i+=5;
		}
		// Ciclo do...while
		
		i=1;
		do
		{
			System.out.println(i);
			i+=2;
		}while(i<=1000);
		
		i=1;
		do
		{
			System.out.println(i);
			i+=3;
		}while(i<=1000);		
		
		i=1;
		do
		{
			System.out.println(i);
			i+=5;
		}while(i<=1000);
	}


}
