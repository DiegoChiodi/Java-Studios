package ExFinal;

import java.util.Scanner;

public class Ex1 {
	
	public static void areaTerreno(int n1, int n2)
	{
		int area = n1 * n2;
		System.out.println("A areá do torreno é " + area + "!");
	}
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno:   ");
		int largura = tec.nextInt();
		System.out.print("Digite o comprimento do terreno:   ");
		int comprimento = tec.nextInt();
		
		areaTerreno(largura,comprimento);
		
		
		/* Crie um algoritmo para auxiliar esta imobiliária de forma que,
		no método principal, o algoritmo solicite as dimensões do terreno e, em seguida,
		chame um subprograma chamado areaTerreno que recebe as dimensões do terreno nos parâmetros,
		calcula a área do terreno e exibe-a ao usuário.*/

	}

}
