import java.util.Scanner;

public class LivroTeste {
	public static void main(String[] args)
	{
		Scanner tec = new Scanner(System.in);
		
		Livro[] livros = new Livro [2];
		
		for (int i  = 0; i < livros.length; i++)
		{
			
			Livro livro = new Livro();
			
			System.out.println("Autor: ");
			livro.autor = tec.nextLine();
			
			System.out.println("titulo");
			livro.titulo = tec.nextLine();
			
			System.out.println("Editora:");
			Editora editora = new Editora();
			editora.nome = tec.next();
			livro.editora = editora;
			
			System.out.println("anoPublicação: ");
			livro.anoPublicacao = tec.nextInt();
			tec.nextLine(); 
			
			System.out.println("preço: ");
			livro.preco = tec.nextDouble();
			tec.nextLine(); 
			
			livros[i] = livro;
			
		}
		exibirValorTotal(livros);
	}
	
	public static void exibirValorTotal(Livro[] livros)
	{
		for (int i = 0; i < livros.length; i++)
		{
			System.out.println( "Autor: " + livros[i].autor + ", titulo: " + livros[i].titulo + ", editora: " + livros[i].editora.nome + 
					", ano de publicação: " + livros[i].anoPublicacao + " preco: " + livros[i].preco);
		}
	}
}
