package com.Ejercicio06.main;
import java.util.Scanner;
//subido a git 
public class AppEjercicio13 {

	public static void main(String[] args) {
		
		int iNum=0;
		int i;
		boolean isPrimo=true;
		boolean isPar=false;
		char cRes='s';
		Scanner entrada=new Scanner(System.in);
		
		do
		{
			isPrimo=true;
			System.out.println("Ingresar un numero: ");
			iNum=entrada.nextInt();
			
			if(iNum%2==0)
			{
				isPar=true;
			}
				
			for(i=2;i<iNum;i++)
			{
				if(iNum%i==0)
				{
					isPrimo=false;
				}
			}
			
			if(isPar==true)
			{
				System.out.print("Es par y ");
			}
			else
			{
				System.out.print("Es impar y ");
			}	
			
			if(isPrimo==true)
			{
				System.out.print("es primo.");
			}
			else
			{
				System.out.print("no es primo.");
			}
			System.out.println();
			System.out.println("¿Desea continuar(s/n)?");
			cRes=entrada.next().charAt(0);
		}while(cRes=='s'||cRes=='S');
		
	}

}
