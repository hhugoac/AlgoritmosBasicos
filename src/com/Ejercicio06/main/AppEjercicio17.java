package com.Ejercicio06.main;


public class AppEjercicio17 {

	public static void main(String[] args) {
		int iSuma=1;
		int i,j;
		boolean isPrimo=true;
		
		
		//for(i=2;i<=5;i=i+2)
		//{
		//	iSuma+=i;
		//}
		
		for(i=1;i<=6;i++)
		{
		
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrimo=false;
					System.out.println(isPrimo);
				}
			}
			if(isPrimo==true)
			{
				iSuma+=i;
				System.out.println(iSuma+"es primo"+i);
				//iSuma+=i;
			}
			
		}
		System.out.println("La suma de los numeros pares y primos del 100-200 es:"+iSuma);	
		
	}

}
