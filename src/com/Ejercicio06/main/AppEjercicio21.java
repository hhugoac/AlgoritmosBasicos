//package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio21 {

	public static void main(String[] args) {
		int i,j,iNum;
		String sEspacio="  ";
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese un numero del cual quiere su triangulo: ");
		iNum=entrada.nextInt();
		
		//Ciclo for
		System.out.println("Ciclo for"+factorial(5));
		for(i=1;i<=iNum;i++) //Ciclo de filas
    	{
		        for(j=1;j<=i;j++)// Ciclo de columnas
		        {
		        	System.out.print(i+" ");
		        }	
		        System.out.println();
		}
		
		//Ciclo while
		System.out.println("Ciclo while");
		i=1;
		while(i<=iNum)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(i+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		//Ciclo do...while
		System.out.println("Ciclo do...while");
		i=1;
		do
		{
			j=1;
			do
			{
				System.out.print(i+" ");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=iNum);
	
	}
}
