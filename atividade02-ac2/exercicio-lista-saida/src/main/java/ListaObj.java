public class ListaObj<T> {
    private T[] vetor;
    private int nroElem;

    public ListaObj(int tamanho) {
        this.vetor = (T[]) new Object[tamanho];
        this.nroElem = 0;
    }

    public void adiciona(T elemento) {
        if (elemento != null) {
            if (nroElem >= vetor.length) {
                throw new IllegalStateException("Lista cheia");
            }
            vetor[nroElem] = elemento;
            nroElem++;
        }
    }

    public int getTamanho() {
        return nroElem;
    }

    public T getElemento(int indice) {
        if (indice >= 0 && indice < nroElem) {
            return vetor[indice];
        }
        return null;
    }

    public void exibe() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }
}
