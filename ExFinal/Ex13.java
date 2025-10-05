package ExFinal;

import java.util.Scanner;

public class Ex13 
{
	public static void lerNotas ()
	{
		Scanner tec = new Scanner(System.in);
		int soma = 0;
		int x;
		for (x = 1; x <= 5; x++)
		{
			System.out.println("Digite a nota de um aluno (de 0 a 10)");
			soma += tec.nextInt();
		}
		
		int result = media(soma,x);
		
		if (result <= 5)
		{
			System.out.println("A turma foi mal");
		} else if (result < 7)
		{
			System.out.println("A turma foi razoavel");
		} else {
			System.out.println("A turma foi bem");
		}
	}
	
	public static int media (int n1, int n2)
	{
		int media = n1 / n2;
		
		return media;
	}
	
	public static void main (String [] args)
	{
		lerNotas();
	}
}
