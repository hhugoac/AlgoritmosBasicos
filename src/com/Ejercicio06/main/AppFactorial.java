package com.Ejercicio06.main;

public class AppFactorial {
	static int factorial(int iNum) 
	{
		if(iNum<=1) {
			return 1;
		}
		else
		{
			return iNum*factorial(iNum-1);
		}
	}

}
