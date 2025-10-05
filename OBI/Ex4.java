import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int x = 1;
		int y = 0;
		
		
		while (x >= y)
		{
			System.out.println("Digite um número inteiro, que vai ser o ínicio do intervalo");
			x = tec.nextInt();
			System.out.println("Digite um número inteiro, que vai ser o final do intervalo");
			y = tec.nextInt();
		}
		System.out.println("");
		System.out.print("Números pares do intervalo:");
		while (x<=y)
		{
			if (x % 2 == 0)
			{
				System.out.print(" - " + x);
			}
			x++;
		}
		
		
	}

}
