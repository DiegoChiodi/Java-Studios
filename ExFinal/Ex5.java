package ExFinal;

import java.util.Scanner;

public class Ex5 {
	public static void verificarNumeros(int n1, int n2)
	{
		if (n1 == n2)
		{
			System.out.println("Os números são iguais!");
		} else {
			System.out.println("Os números são diferentes!");
		}
	}
	
	public static void main (String[] args)
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite dois números:   ");
		int x = tec.nextInt();
		int y = tec.nextInt();
		verificarNumeros(x,y);

	}
}
