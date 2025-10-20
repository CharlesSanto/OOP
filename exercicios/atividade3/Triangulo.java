package exercicios.atividade3;

public class Triangulo extends Forma2D {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(
            (lado1 == lado2 && lado2 == lado3) ? "Triângulo Equilátero" :
            (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) ? "Triângulo Isósceles" :
            "Triângulo Escaleno"
        );

        if (lado1 + lado2 < lado3 || lado1 + lado3 < lado2 || lado2 + lado3 < lado1) {
            throw new IllegalArgumentException("Os três lados informados não formam um triângulo." + 
                "Para formar um triângulo, a cada dois lados somados, deverá ser maior que o terceiro.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void descricao() {
        System.out.println("Nome: " + obterNome());
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
