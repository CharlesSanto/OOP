package exercicios.atividade2;

import java.util.Scanner;

public class Algoritmo1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String linha = scanner.nextLine();

        String[] partes = linha.split("\t");
        int numero = Integer.parseInt(partes[0]);
        float numero_float = Float.parseFloat(partes[1]);
        String nomeComposto = partes[2];

        System.out.println("\nVocê digitou o inteiro: " + numero);
        System.out.println("Você digitou o ponto flutuante: " + numero_float);
        System.out.println("Você digitou o nome composto: " + nomeComposto);
        System.out.println("");
        
        scanner.close();
    }
}
