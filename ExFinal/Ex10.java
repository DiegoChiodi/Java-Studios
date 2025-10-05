package ExFinal;

import java.util.Random;
import java.util.Scanner;

public class Ex10 
{
	public static int obterNumeroAleatorio(int n1, int n2)
	{
		Random ale = new Random();
		int sorteado = ale.nextInt(n2 - n1) + n1;
		return sorteado;
	}
	
	public static void main(String[] args)
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite dois números o minimo e o máximo de um intervalo");
		int min = tec.nextInt();
		int max = tec.nextInt();
		int sorteado;
		System.out.print(" - ");
		for (int i = 1; i <= 10; i++)
		{
			sorteado = obterNumeroAleatorio(min,max);
			System.out.print(sorteado + " - ");
		}
	}
}
