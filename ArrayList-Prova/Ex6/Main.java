package Ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner tec = new Scanner(System.in);
		
		ArrayList<Pet> pets = new ArrayList<>();
		int opcao = 0;
		
		while (opcao != 4)
		{
			System.out.println("MENU DE OPÇÕES:");
			System.out.println("1. Adicionar um Pet");
			System.out.println("2. Remover um Pet");
			System.out.println("3. Exibir todos os Pets");
			System.out.println("4. Sair");
			System.out.print("OPÇÃO:");
			
			opcao = tec.nextInt();
			
			switch(opcao)
			{
				case 1:
					Pet pet = new Pet();
					System.out.println("Nome:");
					pet.nome = tec.next();
					
					System.out.println("Valor:");
					pet.valor = tec.nextDouble();
					
					pets.add(pet);
					tec.next();
					
					break;
				case 2:
					System.out.println("Escolha o índice do pet que quer remover");
					int index = tec.nextInt();
					
					if (index < pets.size())
					{
						pets.remove(index);
					} else {
						System.out.println("O índice é inválido");
					}
					
					break;
				
				case 3:
					for (int i = 0; i < pets.size(); i++)
					{
						System.out.println(pets.get(i));
					}
			}
		}

	}

}
