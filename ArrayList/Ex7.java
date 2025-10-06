import java.util.ArrayList;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		ArrayList<Integer> idades = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			int idade = tec.nextInt();
			idades.add(idade);
		}
		
		int totIdade = 0;
		for (int i : idades)
		{
			totIdade += i;
		}
		
		System.out.println(totIdade / idades.size());
	}

}
