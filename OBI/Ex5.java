import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Digite um número inteiro positivo:   ");
		int n = teclado.nextInt();
		int resultado = n;
		int produtosN = n - 1;
		
		while (produtosN > 0)
		{
			produtosN -= 1;
			resultado += produtosN * resultado;
		}
		System.out.println("O fatorial de " + n + " é " + resultado);
	}

}
