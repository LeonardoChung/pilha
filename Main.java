public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.insere(1);
        pilha.insere(2);
        pilha.insere(3);
        pilha.insere(4);
      

        System.out.println("Pilha:");
        pilha.imprime();

        pilha.remove();
        System.out.println("Pilha depois de excluir:");
        pilha.imprime();
    }
}
