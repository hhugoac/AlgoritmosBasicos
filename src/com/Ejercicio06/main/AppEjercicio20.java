package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio20 {

	public static void main(String[] args) {
		int iNum1,iNum2,i,j;
		
		Scanner entrada=new Scanner(System.in);
		
		//Ciclo for
		
		System.out.println("Ingresar un numero: ");
		iNum1=entrada.nextInt();
		
		System.out.println("Ingresar otro numero: ");		
		iNum2=entrada.nextInt();
		
		//Ciclo for
		System.out.println("Ciclo for");
		for(i=1;i<=iNum1;i++)
		{
			for(j=1;j<=iNum2;j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"	");
			}
			System.out.println();
		}
		
		//Ciclo while
		System.out.println("Ciclo while");
		i=1;
		
		while(i<=iNum1)
		{
			j=1;
			while(j<=iNum2)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"	");
				j++;
			}
			System.out.println();
			i++;
		}
		
		// Ciclo do...while
		System.out.println("Ciclo do...while");
		i=1;
		do
		{
			j=1;
			do
			{
				System.out.print(i+"x"+j+"="+(i*j)+"	");
				j++;
			}while(j<=iNum2);
			System.out.println();
			i++;
		}while(i<=iNum1);
	}
}
