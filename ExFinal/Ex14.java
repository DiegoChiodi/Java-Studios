package ExFinal;

import java.util.Scanner;

public class Ex14 
{
	public static String getCategoria(int n1)
	{
		String categoria = "";
		
		if (n1 >= 5 && n1 <= 7)
		{
			categoria = "Infantil";
		} else if (n1 <= 10)
		{
			categoria = "Infantil B";
		} else if (n1 <= 13)
		{
			categoria = "Juvenil";
		} else if (n1 <= 17)
		{
			categoria = "Juvenil B";
		} else {
			categoria = "Adulto";
		}
		
		return categoria;
	}
	
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.println("Qual a idade do atleta");
		int idade = tec.nextInt();
		
		String result = getCategoria(idade);
		System.out.println("O atleta pertence a categoria " + result);
		
	}

}
