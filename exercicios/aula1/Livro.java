package exercicios.aula1;

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


        livro1.exibir();
    }

    public void exibir()
    {
        System.out.println("\nDetalhes do Livro:\n");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println(" ");
    }
}
