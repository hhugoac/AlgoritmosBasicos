package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio23 {

	public static void main(String[] args) {
		char cLetra=' ';
		String sCadena;
		char respuesta=' ';
		Scanner entrada= new Scanner(System.in);
		
		do
		{
		System.out.println("Escribe una letra de la A-F");
		sCadena=entrada.next();
		cLetra=sCadena.charAt(0);
		//Para ahorrar las dos lineas anterior se puede hacer la siguiente linea de codigo cLetra=entrada.next().charAt(0);
		
		System.out.println("La letra inicial es "+cLetra);
		
		
		switch(cLetra)
		{
			case 'A': 
			case 'a': System.out.println("Tienes 10");
			break;
			
			case 'B': 
			case 'b': System.out.println("Tienes 9");
			break;
			
			case 'C': 
			case 'c': System.out.println("Tienes 8");
			break;
			
			case 'D': 
			case 'd': System.out.println("Tienes 7");
			break;
			
			case 'E': 
			case 'e': System.out.println("Tienes 6");
			break;
			
			case 'F': 
			case 'f': System.out.println("Tienes 5");
			break;
			
			default: System.out.println("Calificacion no valida");
			break;
			}
		
			System.out.println("Deseas capturar otra calificación(S/N)?");
			sCadena=entrada.next();
			respuesta=sCadena.charAt(0);
		}while(respuesta=='s'||respuesta=='S');
	}

}
