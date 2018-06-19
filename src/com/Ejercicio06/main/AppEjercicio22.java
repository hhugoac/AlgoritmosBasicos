package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio22 {

	public static void main(String[] args) {
		int i,iNum,iFac;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingrese un numero del cual quiere su factorial: ");
		iNum=entrada.nextInt();
		
		//Ciclo for
		iFac=1;
		System.out.println("Ciclo for");
		System.out.print(iNum+"!=");
		for(i=iNum;i>1;i--)
		{
			iFac=iFac*i;
			System.out.print(i+"*");
		}
		System.out.print("1="+iFac);
		
		//Ciclo while
		iFac=1;
		System.out.println();
		System.out.println("Ciclo while");
		System.out.print(iNum+"!=");
		i=iNum;
		while(i>1)
		{
			iFac=iFac*i;
			System.out.print(i+"*");
			i--;
		}
		System.out.print("1="+iFac);
		
		//Ciclo do...while
		iFac=1;
		i=iNum;
		System.out.println();
		System.out.println("Ciclo do...while");
		System.out.print(iNum+"!=");
		do
		{
			iFac=iFac*i;
			System.out.print(i+"*");
			i--;
		}while(i>1);
		
		System.out.print("1="+iFac);
	}
}
