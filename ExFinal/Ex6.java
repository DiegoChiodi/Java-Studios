package ExFinal;

import java.util.Scanner;

public class Ex6 
{
	public static void converterCelsius(double n1)
	{
		double celsius = (n1 - 32) / 1.8;
		System.out.println(n1 + " fahrenheit equivale a " + celsius + " celsius.");
	}
	
	public static void converterFahrenheit (double n1)
	{
		double fahrenheit = (1.8 * n1) + 32;
		System.out.println(n1 + " celsius equivale a " + fahrenheit + " fahrenheit.");
	}
	
	public static void main (String[] args)
	{
		Scanner tec = new Scanner(System.in);
		while (true)
		{
			System.out.println("Escolha uma escala de medidas de temperatura(1 para Celsius e 2 para Farenheit)");
			int escolha = tec.nextInt();
			
			System.out.println("também escolha a temperatura na escala informada.");
			double escala = tec.nextDouble();
			if (escolha == 1)
			{
				converterFahrenheit(escala);
			} else if (escolha == 2)
			{
				converterCelsius(escala);
			}
		}
	}
}
