package exercicios.aula1;

public class Retangulo {
    
    double comprimento;
    double largura;

    public static void main(String[] args)
    {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.comprimento = 10;
        retangulo1.largura = 5;

        double area = retangulo1.calcularArea();

        System.out.println("A área do retângulo é: " + area);
    }

    public double calcularArea() {
        return comprimento * largura;
    }
}
