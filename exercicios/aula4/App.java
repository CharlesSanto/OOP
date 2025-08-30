public class App {
    public static void main(String[] args) {

        // Medico m1 = new Pessoa("Ana", 25); 
        // Porque nem toda Pessoa é um Medico

        // Funciona porque um Medico é uma Pessoa
        Pessoa m2 = new Medico("Carlos", 45, "12345-DF", "Cardiologia");

        m2.cumprimentar(); 
        // Chama o método sobrescrito em Medico (polimorfismo)

        ((Pessoa)m2).cumprimentar();
        // Mesmo comportamento: cast não altera o objeto real

        // m2.atender();
        // Porque a variável é do tipo Pessoa, que não tem "atender()"

        ((Medico)m2).atender();
        // Funciona porque cast para Medico permite chamar o método

        // Medico m3 = m2;
        // Porque a variável Medico não pode receber diretamente uma Pessoa

        Medico m3 = (Medico)m2;
        // Funciona: cast explicito para Medico
        m3.atender(); 

        Pessoa p1 = new Pessoa("Caio", 25);
        p1.cumprimentar();

        // ((Medico)p1).cumprimentar();
        // Porque: p1 é um objeto Pessoa "puro", não é Medico
    }
}