package com.Ejercicio06.main;

import java.util.Scanner;

public class AppEjercicio11a {

	public static void main(String[] args) 
	{
		int iNum=0;
		int i;
		boolean isPrimo=true;
		boolean isPar=false;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresar un numero: ");
		iNum=entrada.nextInt();
		
		for(i=2;i<iNum;i++)
		{
			if(iNum%i==0)
			{
				isPrimo=false;
			}
		}
		
		if(isPrimo==true)
		{
			System.out.print("Es primo.");
		}
		else
		{
			System.out.print("No es primo.");
		}	
			
	}

}
