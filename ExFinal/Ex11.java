package ExFinal;

import java.util.Scanner;

public class Ex11 
{
	public static void exibirMenu()
	{
		Scanner tec = new Scanner(System.in);
		
		System.out.println("MENU DE OPÇÕES:");
		System.out.println("Calcular Potência");
		System.out.println("Calcular Raiz Quadrada");
		System.out.println("Calcular Média");
		System.out.println("Sair");
		System.out.print("Opção: ");
		int opcao = tec.nextInt();
		if (opcao == 1)
		{
			System.out.println("Digite um número para ser potencializado");
			int numPoten = tec.nextInt();
			
			System.out.println("Digite um número para ser potencializado");
			int poten = tec.nextInt();
			
			int result = calPotencia(numPoten,poten);
			System.out.println(numPoten + " potencializado por " + poten + " é " + result);
		} else if (opcao == 2)
		{
			System.out.println("Digite um número");
			int numRaizQuadrada = tec.nextInt();
			
			int result = calRaizQuadrada(numRaizQuadrada);
			System.out.println("A raiz quadrada de " + numRaizQuadrada + " é " + result);
		} else if (opcao == 3)
		{
			System.out.println("Digite 3 números");
			int n1 = tec.nextInt();
			int n2 = tec.nextInt();
			int n3 = tec.nextInt();
			int result = calMedia(n1,n2,n3);
			System.out.println("A média desses números é " + result);
		} else if (opcao == 4)
		{
			System.out.println("Você saiu do sistema");
		} else {
			System.err.println("Opção inválida");
			exibirMenu();
		}
	}
	
	public static int calPotencia (int n1, int n2)
	{
		int result = (int) Math.pow(n1, n2);//talves de merda pq ele quer double
		return result;
	}
	
	public static int calRaizQuadrada (int n1)
	{
		int result = (int) Math.sqrt(n1);
		return result;
	}
	
	public static int calMedia (int n1, int n2, int n3)
	{
		int media = (n1 + n2 + n3) / 3;
		return media;
	}
	
	
	public static void main (String[] args)
	{
		exibirMenu();
	}
}
