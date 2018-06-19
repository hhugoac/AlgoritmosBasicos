/*
 *  Ejercicio 5, aprendiendo las generalidades de Java
 * 
 * 
 */

package com.Ejercicio06.main;
import java.util.Scanner;

public class AppmostrarNombres {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Declaracion de los diferentes tipos de variables 
		String sNombre=" ";
		char caracter=' ';
		double valor=0.0;
		boolean isTrue=false;
		float valor2=0;
		int cont2=0;
		
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dame tu nombre: ");
		sNombre=entrada.next();  //equivale a aceptar aceptar del pseudocodigo

		//ciclo for
		for(int cont=0;cont<10;cont++) 
		{
			System.out.println("for Hola "+sNombre);			
		}
		
		//ciclo while
		
		System.out.println("Dame tu nombre: ");
		sNombre=entrada.next();  //equivale a aceptar aceptar del pseudocodigo

		while(cont2<10)
		{
			System.out.println("While Hola "+sNombre);
			cont2++;
		}
		
		//ciclo do...while
		System.out.println("Dame tu nombre: ");
		sNombre=entrada.next();  //equivale a aceptar aceptar del pseudocodigo

		cont2=0;
		do
		{
			System.out.println("do...While Hola "+sNombre);
			cont2++;
		}while(cont2<10);
				
	}

}
