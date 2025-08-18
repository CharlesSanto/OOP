package exercicios.atividade2;

import java.util.Scanner;;

public class Algoritmo3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        
        char[] charArray = str.toCharArray();

        int i = 0;
        int j = str.length() - 1;

        while(i < j)
        {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            
            i++;
            j--;
        }

        System.out.println(String.valueOf(charArray));

        scanner.close();
    }
}
