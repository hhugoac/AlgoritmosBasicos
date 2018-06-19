package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio05 {

	public static void main(String[] args) 
	{
		// Ejercicio con 
		int iEdad=0;
		
		java.util.Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dame tu edad:");
		iEdad=entrada.nextInt();
		if(iEdad<5)
		{
			System.out.println("Niño");
		}
		else if(iEdad>=5 && iEdad<18)
		{
			System.out.println("Adolescente");
		}
		else if(iEdad>=18 && iEdad<36)
		{
			System.out.println("Chavoruco");
		}
		else if(iEdad==36)
		{
			System.out.println("Inmortal");
		}
		else if(iEdad>36)
		{
			System.out.println("Viejito");
		}
		
		
		// Forma con solo condiciones if
		if(iEdad<5)
		{
			System.out.println("Niño");
		}
		if(iEdad>=5 && iEdad<18)
		{
			System.out.println("Adolescente");
		}
		if(iEdad>=18 && iEdad<36)
		{
			System.out.println("Chavoruco");
		}
		if(iEdad==36)
		{
			System.out.println("Inmortal");
		}
		if(iEdad>36)
		{
			System.out.println("Viejito");
		}
		
		// Forma condiciones if anidados
		if(iEdad<5)
		{
			System.out.println("Niño");
		}
		else
		{
			if(iEdad>=5 && iEdad<18)
			{
				System.out.println("Adolescente");
			}
			else
			{
				if(iEdad>=18 && iEdad<36)
				{
					System.out.println("Chavoruco");
				}
				else
				{
					if(iEdad==36)
					{
						System.out.println("Inmortal");
					}
					else
						if(iEdad>36)
						{
							System.out.println("Viejito");
						}
				}
			}
		}
		
	}

}
