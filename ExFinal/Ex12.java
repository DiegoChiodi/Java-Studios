package ExFinal;

import java.util.Scanner;

public class Ex12 {
	
	public static int fatorial (int n1)
	{
		int total = 1;
		for (int i = n1; i >= 1; i --)
		{
			total *= i;
		}
		return total;
	}
	
	public static void main (String[] args)
	{
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Digite um número");
		int f = -1;
		while (f < 0 || f > 6)
		{
			f = tec.nextInt();
		}
		int result = fatorial(f);
		
		System.out.println("O fatorial de " + f + " é " + result);
		
	}
}
