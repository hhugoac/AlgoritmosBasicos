package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio12 {

	public static void main(String[] args) 
	{
		int iNum=10;
		int i=0;
		int a=0;
		int b=1;
		int c=0;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresar el numero de veces que desea iterar la serie Fibonacci:");
		iNum=entrada.nextInt();
		
		System.out.println();
		System.out.print(a+" ");
		System.out.print(b+" ");
				
		//Ciclo for
		for(i=0;i<=iNum-3;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.println();
		
		
		//Ciclo while
		i=0;
		a=0;
		b=1;
		c=1;
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(i<iNum-2) 
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		System.out.println();
		
		//Ciclo hacer...mientras
				i=0;
				a=0;
				b=1;
				c=1;
				
				System.out.print(a+" ");
				System.out.print(b+" ");
				
				do
				{
					c=a+b;
					System.out.print(c+" ");
					a=b;
					b=c;
					i++;
				}while(i<iNum-2); 
	}

}
