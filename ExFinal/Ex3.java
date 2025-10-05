package ExFinal;

import java.util.Scanner;

public class Ex3 
{
	public static void maiorNumero(int n1, int n2, int n3)
	{
		int maior;
		if (n1 > n2 && n1 > n3)
		{
			maior = n1;
		} else if (n2 > n1 && n2 > n3)
		{
			maior = n2;
		} else {
			maior = n3;
		}
		System.out.println("O maior número é " + maior);
	}
	
	public static void lerNumero ()
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite 3 números inteiro que exibirei o maior:   ");
		int x = tec.nextInt();
		int y = tec.nextInt();
		int z = tec.nextInt();
		
		maiorNumero(x,y,z);
	}
	public static void main(String[] args) 
	{
		lerNumero();
	}

}
