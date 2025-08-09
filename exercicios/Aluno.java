package exercicios;
public class Aluno 
{
    String nome;
    int idade;
    String curso;


    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Charles";
        aluno1.idade = 20;
        aluno1.curso = "Ciência da Computação";

        aluno1.Apresentar();
    }

    public void Apresentar()
    {
        System.out.println("\nApresentando aluno:\n");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Curso: " + this.curso);
        System.out.println("\n");
    }
}