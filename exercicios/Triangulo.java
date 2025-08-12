package exercicios;

public class Triangulo {
    
    double ladoA;
    double ladoB;
    double ladoC;

    public static void main(String[] args)
    {
        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 3;
        triangulo1.ladoB = 4;
        triangulo1.ladoC = 5;

        if (triangulo1.formaTriangulo()) {
            System.out.println("Tipo do triangulo1: " + triangulo1.obterTipo());
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

    public String obterTipo()
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
