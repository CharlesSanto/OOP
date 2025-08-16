package exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Escolha a operação: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
        System.out.print("Digite o número da operação: \n");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1: System.out.println(Calculadora.adicao(num1, num2));
                break;
            case 2: System.out.println(Calculadora.subtracao(num1, num2));
                break;
            case 3: System.out.println(Calculadora.multiplicacao(num1, num2));
                break;
            case 4: System.out.println(Calculadora.divisao(num1, num2));
                break;
            default:
                break;
        }

        scanner.close();

    }
    
    public static String adicao(int num1, int num2)
    {
        return "Resultado da soma: " + (num1 + num2) + "\n";
    }

    public static String subtracao(int num1, int num2)
    {
        return "Resultado da subtração: " + (num1 - num2) + "\n";
    }

    public static String multiplicacao(int num1, int num2)
    {
        return "Resultado da multiplicação: " + (num1 * num2) + "\n";
    }

    public static String divisao(int num1, int num2)
    {
        if (num2 == 0) {
            return "Erro: Divisão por zero não é permitida.\n";
        }
        return "Resultado da divisão: " + (num1 / num2) + "\n";
    }

}
