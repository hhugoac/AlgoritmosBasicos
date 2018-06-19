package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio04 {

	public static void main(String[] args) 
	{
		Scanner entrada=new Scanner(System.in);
		int iNum=0;
		
		System.out.println("Ingresar un numero: ");
		iNum=entrada.nextInt();
		
		if(iNum==0)
		{
			System.out.println("Numero par");
		}					
		else
		{
			System.out.println("Numero impar");
		}	
	}

}
