package exercicios.atividade3;

public class Circulo extends Forma2D{

    private double raio;

    public Circulo(double raio)
    {
        super("Circulo");
        if (!(raio > 0)) {
            throw new IllegalArgumentException("Raio deve ser > 0.");
        }
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void descricao() {
        System.out.println("Nome: " + obterNome());
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
