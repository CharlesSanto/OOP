package exercicios.atividade2;

import java.util.Scanner;

public class Algoritmo2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();

        int indice = -1;

        for (int i = frase.length() - 1; i >= 0; i--)
        {
            char c = frase.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            {
                indice = i;
                break;
            } 
        }

        if (indice != -1) {
            System.out.println("Última vogal encontrada no índice: " + indice);
        } else {
            System.out.println("Vogal não encontrada!");
        }
        
        scanner.close();

    }
}
