import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		Random ale = new Random();

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10;i++)
        {
        	numeros.add(ale.nextInt(101));
        }
        
        System.out.println(maiorNumero(numeros));
        	

	}
	
	public static int maiorNumero(ArrayList<Integer> ver)
	{
		int maior = 0;
		for (int i : ver)
		{
			if (maior < i)
			{
				maior = i;
			}
		}
		return maior;
	}

}
