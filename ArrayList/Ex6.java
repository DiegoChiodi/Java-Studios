import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			String nome = tec.next();

			nomes.add(nome);

		}
		
		boolean encontrado = false;
		for (int i = 0; i < nomes.size(); i++)
		{
			if (nomes.get(i).equals("Maria"))
			{
				encontrado = true;
				break;
			}
		}
		
		if (encontrado)
		{
			System.out.println("Encontrado");
		}
		 else {
			System.out.println("Não encontrado");
		}
		
		
		

	}

}
