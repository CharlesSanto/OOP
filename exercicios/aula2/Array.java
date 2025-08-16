package exercicios.aula2;

import java.util.Scanner;

public class Array {
	
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[] numero = new int[5];
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Digite um número: ");
			numero[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		for (int i = 0; i < numero.length; i++)
		{
			System.out.printf("Numero %d: %d\n", i + 1, numero[i]);
		}
		
		
	}
}

