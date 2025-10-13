
public class Livro {
    public String autor;
    public String titulo;
    public Editora editora = new Editora();
    public int anoPublicacao;
    public double preco;
    
    public String toString()
	{
		return "Autor: " + autor + ", titulo: " + titulo + ", editora: " + editora.nome + 
				", ano de publicação: " + anoPublicacao + " preco: " + preco;
	}
}