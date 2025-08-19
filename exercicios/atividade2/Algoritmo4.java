package exercicios.atividade2;

import java.util.Scanner;
import java.text.Normalizer;

class Algoritmo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine().toLowerCase();
        String fraseSemEspacos = frase.replaceAll("[^a-zA-Z0-9]", "");
        String limpo = removerAcentos(fraseSemEspacos);

        int i = 0;
        int j = limpo.length() - 1;

        boolean isPalindromo = true;
        while (i < j) {
            if (limpo.charAt(i) != limpo.charAt(j))
            {
                isPalindromo = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindromo) {
            System.out.println("A frase é um palíndromo.");
        } else {
            System.out.println("A frase não é um palíndromo.");
        }
        
        scanner.close();
    }

    public static String removerAcentos(String input) 
    {
        if (input == null) return null;
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }
}