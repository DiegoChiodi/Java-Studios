package ExFinal;

import java.util.Scanner;

public class Ex4 
{

	public static void divisivelPor(int n1, double n2)
	{
		int contDivisiveis = 0;
		for (int i = 0; i <= n1; i++)
		{
			if (i % n2 == 0)
			{
				System.out.println(i + " é divisivel por " + n2);
				contDivisiveis ++;
			}
		}
		
		System.out.println("Existem " + contDivisiveis + " divisores por " + n2 +" no intervalo 0 a " + n1);
	}
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite um número que sera o limite do intervalo 0 e x");
		int limite = tec.nextInt();
		
		System.out.println("Digite um número que sera o divisor do intervalo 0 e " + limite);
		double divisor = tec.nextDouble();
		
		divisivelPor(limite,divisor);

	}

}
