package ExFinal;

import java.util.Scanner;

public class Ex7 
{
	public static void exibirFatorial(int n1)
	{
		int result = 1;
		for (int i = 2; i <= n1; i++)
		{
			result *= i;
		}
		System.out.println("!" + n1 + " = " + result);
	}
	
	public static void main (String[] args)
	{
		Scanner tec = new Scanner(System.in);
		int x = -1;
		System.out.print("Digite um número:   ");
		x = tec.nextInt();
		
		while (x < 0 || x > 6)
		{
			System.err.println("Não foi possível realizar o cálculo. Digite novamente");
			x = tec.nextInt();
		}
		exibirFatorial(x);
	}
}
