package ExFinal;

import java.util.Scanner;

public class Ex15 {

	public static int calDivi (int n1)
	{
		int divi = 0;
		
		for (int i = 1; i <= n1; i++)
		{
			if (n1 % i == 0)
			{
				divi++;
			}
		}
		return divi;
	}
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite um número que queira saber quantos divisores ele tem");
		int x = tec.nextInt();
		
		int result = calDivi(x);
		
		System.out.println("Existem " + result + " números que dividem inteiramente o " + x);
		
	}

}
