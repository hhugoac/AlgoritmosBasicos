package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio16 {

	public static void main(String[] args) {
		int iNum1;
		int pow;
		int iNum2;
		int i;
		Scanner entrada=new Scanner(System.in);
		
		//ciclo for
		System.out.println("Dar un numero");
		iNum1=entrada.nextInt();
		
		System.out.println("A que potencia lo quiere elevar: ");
		iNum2=entrada.nextInt();

		pow=iNum1;

		for(i=0;i<iNum2-1;i++)
		{
			iNum1*=pow;
		}
		System.out.println(iNum1);
		
		//ciclo while
		System.out.println("Dar un numero");
		iNum1=entrada.nextInt();
		
		System.out.println("A que potencia lo quiere elevar: ");
		iNum2=entrada.nextInt();

		pow=iNum1;
		i=0;
		while(i<iNum2-1)
		{
			iNum1*=pow;
			i++;
		}
		System.out.println(iNum1);
		
		//ciclo do...while
		System.out.println("Dar un numero");
		iNum1=entrada.nextInt();
		
		System.out.println("A que potencia lo quiere elevar: ");
		iNum2=entrada.nextInt();

		pow=iNum1;
		i=0;
		do
		{
			iNum1*=pow;
			i++;
		}while(i<iNum2-1);
		System.out.println(iNum1);
		
	}

}
