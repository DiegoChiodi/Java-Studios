package ExFinal;

import java.util.Scanner;

public class Ex9 
{
	public static double getConceito (double n1, double n2, double n3)
	{
		char convertido = ' ';
		double media = (n1 + n2 + n3) / 3;
		
		if (media < 5)
		{
			convertido = 'D';
		} else if (media <= 6.8)
		{
			convertido = 'C';
		} else if (media <= 8.5)
		{
			convertido = 'B';
		} else {
			convertido = 'A';
		}
		return convertido;
	}
	
	public static void main (String[] args)
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite a nota das 3 avaliações");
		double x = tec.nextDouble();
		double y = tec.nextDouble();
		double z = tec.nextDouble();
		
		char conceito = (char) getConceito(x,y,z);
		System.out.println("Sua nota final foi " + conceito);
	}
}



