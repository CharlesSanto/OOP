package exercicios.aula1;
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

        aluno1.apresentar();
    }

    public void apresentar()
    {
        System.out.println("\nApresentando aluno:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("\n");
    }
}