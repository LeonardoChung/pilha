public class Pilha {
    private int topo;
    private int[] dados;
    private int capacidade;

    public Pilha(int tamanho) {
        capacidade = tamanho;
        dados = new int[capacidade];
        topo = -1; 
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int valor) {
        if (cheia()) {
            System.out.println("Pilha cheia");
        } else {
            topo = topo + 1;
            dados[topo] = valor;
        }
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Pilha vazia");
            return -1;
        } else {
            int valor = dados[topo];
            topo = topo - 1;
            return valor;
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(dados[i]);
            }
        }
    }
}
