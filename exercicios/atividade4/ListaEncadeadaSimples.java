package exercicios.atividade4;

class No<T> {
    T dado;
    No<T> proximo;

    No(T dado) {
        this.dado = dado;
        this.proximo = null;
    }
}

public class ListaEncadeadaSimples<T> {
    No<T> inicio;
    int length;

    ListaEncadeadaSimples() {
        this.inicio = null;
        this.length = 0;
    }

    public void inverter() {
        No<T> ant = null;
        No<T> atual = this.inicio;
        No<T> prox = null;
        
        while (atual != null) {
            prox = atual.proximo;
            atual.proximo = ant;
            ant = atual;
            atual = prox;
        }
        this.inicio = ant;
    }
}