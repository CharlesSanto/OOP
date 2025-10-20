package exercicios.atividade4;

class No<T> {
    T dado;
    No<T> prox;
    No<T> ant;

    No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

public class ListaEncadeadaDupla<T> {
    No<T> inicio;
    No<T> fim;
    int length;

    ListaEncadeadaDupla() {
        this.inicio = null;
        this.fim = null;
        this.length = 0;
    }

    public void inverter() {
        No<T> atual = this.inicio;
        No<T> temp = null;

        while (atual != null) {
            temp = atual.ant;
            atual.ant = atual.prox;
            atual.prox = temp;

            atual = atual.ant;
        }

        if (temp != null) {
            fim = this.inicio;
            this.inicio = temp.ant;
        }
    }
}
