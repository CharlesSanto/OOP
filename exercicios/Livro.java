package exercicios;

public class Livro {

    String titulo;
    String autor;
    int ano;

    public static void main(String[] args)
    {
        Livro livro1 = new Livro();
        livro1.titulo = "Noites Brancas";
        livro1.autor = "Fiódor Dostoiévski";
        livro1.ano = 1848;


        livro1.Exibir();
    }

    public void Exibir()
    {
        System.out.println("\nDetalhes do Livro:\n");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println(" ");
    }
}
