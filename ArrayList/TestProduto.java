import java.util.*;

public class TestProduto {

	public static void main(String[] args) {

		ArrayList<Produto> lista = new ArrayList<>();
		Scanner tec = new Scanner(System.in);
		
		int opcao = 0;
		
		while (opcao != 4)
		{
			System.out.println("Escolha uma opçao:");
			opcao = tec.nextInt();
			switch(opcao)
			{
				case 1:
					System.out.println("Crie um produto");
					Produto produto = new Produto();
					produto.preco = tec.nextDouble();
					produto.nome = tec.nextLine();
					lista.add(produto);
					break;
				case 2:
					System.out.println("remova o indice");
					int indice = tec.nextInt();
					lista.remove(indice);
					break;
				case 3:
					System.out.println("Exibir lista");
					for (Produto a : lista)
					{
						System.out.println(a);
					}
					break;
			}
		}

	}

}
