package exercicios.aula2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas provas você deseja calcular a média: ");
        int numeroDeProvas = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= numeroDeProvas; i++) {
            System.out.print("Digite a nota da prova " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / numeroDeProvas;
        System.out.printf("A média das notas é: %.2f%n", media);

        scanner.close();
    }
}
