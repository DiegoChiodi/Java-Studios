package ExFinal;

import java.util.Scanner;

public class Ex2 {

	public static void parImpar(int n1)
	{
		boolean par = false;
		if (n1 % 2 == 0)
		{
			par = true;
		}
		if (par)
		{
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é impar!");
		}
	}
	
	public static void lerNumero ()
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Digite um número inteiro, e identificarei se é par ou impar.");
		int num = tec.nextInt();
		parImpar(num);
	}
	public static void main(String[] args) 
	{
		lerNumero();
	}

}
