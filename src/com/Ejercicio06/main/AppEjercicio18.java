package com.Ejercicio06.main;


public class AppEjercicio18 {

	public static void main(String[] args) {
		int i;
		String sCadena="Hola Mundo";
		
		//Ciclo for
		for(i=1;i<=50;i++)
		{
			System.out.println(sCadena+i);
		}
		
		//Ciclo while 
		
		i=1;
		while(i<=50)
		{
			System.out.println(sCadena+1);
			i++;
		}
		
		//Ciclo do...while
		i=1;
		do
		{
			System.out.println(sCadena+i);
			i++;
		}while(i<=50);
	}
}
