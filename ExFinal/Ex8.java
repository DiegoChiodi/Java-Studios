package ExFinal;

import java.util.Scanner;

public class Ex8 
{
	public static double calcularComissao (double n1)
	{
		double venda = 0;
		if (n1 > 500)
		{
			venda = n1 * 0.075;
		} else {
			venda = n1 * 0.05;
		}
		
		return venda;
	}
	
	public static void main (String[] args)
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Quanto o vendedor vendeu?");
		double vendeu = tec.nextDouble();
		vendeu = calcularComissao(vendeu);
		
		System.out.println("A comissão do vendedor é de R$" + vendeu);
		
	}
	
}
