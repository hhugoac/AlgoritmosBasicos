package com.Ejercicio06.main;
import java.util.Scanner;

public class AppEjercicio14 {

	public static void main(String[] args) {
		String sCadena=" ";
		int ilength=0;
		char cLetra=' ';
		int iconta=0;
		int iconte=0;
		int iconti=0;
		int iconto=0;
		int icontu=0;
		int i=0;
		
		Scanner entrada=new Scanner(System.in);
		
		//Ciclo for
		System.out.println("Ingresar una cadena de texto: ");
		sCadena=entrada.next();
		ilength=sCadena.length();
		
		for(i=0;i<ilength;i++)
		{
			cLetra=sCadena.charAt(i);
			switch(cLetra)
			{
				case 'a':iconta++;
				        break;	
				case 'e':iconte++;
					break;
				case 'i':iconti++;
					break;
				case 'o':iconto++;
					break;
				case 'u':icontu++;
					break;
			}
			
		}
		System.out.println("La palabra "+sCadena+" contiene: "+iconta+" veces a,"+iconte+" veces e,"+iconti+" veces i,"+iconto+" veces o,"+icontu+" veces u.");		
		
		//Ciclo while
		System.out.println("Ingresar una cadena de texto: ");
		sCadena=entrada.next();
		ilength=sCadena.length();
		
		iconta=0;
		iconte=0;
		iconti=0;
		iconto=0;
		icontu=0;
		System.out.println("hola"+icontu);
		
		i=0;
		while(i<ilength)
		{
			cLetra=sCadena.charAt(i);
			switch(cLetra)
			{
				case 'a':iconta++;
				        break;	
				case 'e':iconte++;
					break;
				case 'i':iconti++;
					break;
				case 'o':iconto++;
					break;
				case 'u':icontu++;
					break;
			}
			i++;
			
		}
		System.out.println("La palabra "+sCadena+" contiene: "+iconta+" veces a,"+iconte+" veces e,"+iconti+" veces i,"+iconto+" veces o,"+icontu+" veces u.");	
		
		//Ciclo while
		System.out.println("Ingresar una cadena de texto: ");
		sCadena=entrada.next();
		ilength=sCadena.length();
		
		iconta=0;
		iconte=0;
		iconti=0;
		iconto=0;
		icontu=0;
		System.out.println("hola"+icontu);
		
		i=0;
		do
		{
			cLetra=sCadena.charAt(i);
			switch(cLetra)
			{
				case 'a':iconta++;
				        break;	
				case 'e':iconte++;
					break;
				case 'i':iconti++;
					break;
				case 'o':iconto++;
					break;
				case 'u':icontu++;
					break;
			}
			i++;
			
		}while(i<ilength);
		System.out.println("La palabra "+sCadena+" contiene: "+iconta+" veces a,"+iconte+" veces e,"+iconti+" veces i,"+iconto+" veces o,"+icontu+" veces u.");		
	
	}

}
