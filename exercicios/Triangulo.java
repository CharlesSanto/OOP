package exercicios;

import java.util.Scanner;

public class Triangulo {
    
    int ladoA;
    int ladoB;
    int ladoC;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo();

        System.out.println("Digite o lado A do triângulo: ");
        triangulo1.ladoA = scanner.nextInt();
        System.out.println("Digite o lado B do triângulo: ");
        triangulo1.ladoB = scanner.nextInt();
        System.out.println("Digite o lado C do triângulo: ");
        triangulo1.ladoC = scanner.nextInt();

        scanner.close();

        if (triangulo1.formaTriangulo()) {
            System.out.println("O triângulo é do tipo: " + triangulo1.ObterTipo());
        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }
    }

    public boolean formaTriangulo()
    {
        return (ladoA + ladoB > ladoC) 
            && (ladoA + ladoC > ladoB) 
            && (ladoB + ladoC > ladoA);
    }

    public String ObterTipo()
    {
        if (ladoA == ladoB && ladoB == ladoC)
            {
                return "Equilátero";
            }
            else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
            {
                return "Isósceles";
            }
            else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC)
            {
                return "Escaleno";
            }

        return null;
    }
}
