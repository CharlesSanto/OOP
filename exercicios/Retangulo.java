package exercicios;

public class Retangulo {
    
    int comprimento;
    int largura;

    public static void main(String[] args)
    {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.comprimento = 10;
        retangulo1.largura = 5;

        int area = retangulo1.CalcularArea();

        System.out.println("A área do retângulo é: " + area);
    }

    public int CalcularArea() {
        return this.comprimento * this.largura;
    }
}
