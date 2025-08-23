public class Elevador {
	private int andarAtual;
	private int capacidadeMaxima;
	private int pessoas;
	private int totalAndares;
	
	public Elevador(int capacidade, int andares) {
		andarAtual = 0;
		pessoas = 0;
		capacidadeMaxima = capacidade;
		totalAndares = andares;
	}
	
	public void entrar() {
		
		if (pessoas == capacidadeMaxima) {
			System.out.println("Operacao invalida");
			return;
		};;
		pessoas++;
		
	}
	
	public void sair() {
		
		if (pessoas == 0) {
			System.out.println("Operacao invalida");
			return;
		};;
		pessoas--;
		
	}

    public void subir() {
        if (andarAtual == totalAndares) {
            System.out.println("Operacao invalida");
            return;
        }
        andarAtual++;
    }

    public void descer() {
		if (andarAtual == 0) {
			System.out.println("Operacao invalida");
			return;
		};
		andarAtual--;
	}
	
	public void exibir() {
		System.out.printf("Andar atual: %d, capacidade: %d, pessoas: %d, andares: %d\n",
				andarAtual, capacidadeMaxima, pessoas, totalAndares);
	}
}

