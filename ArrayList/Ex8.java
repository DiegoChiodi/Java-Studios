import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<>();

		for(int i = 0; true; i++) {
			String nome = tec.next();
			
			if (nome.equals("sair"))
			{
				break;
			}

			nomes.add(nome);

		}
		
		for (String nome : nomes)
		{
			System.out.println(nome);
		}

	}

}
