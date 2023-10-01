public class ListaEstatica <T> {

    private T[] vetor;
    private int nroElem;

    public ListaEstatica(int tamanho) {
        this.vetor = (T[]) new Object[tamanho];
        this.nroElem = 0;
    }

    public void add(T num) {
        vetor[nroElem] = num;
        nroElem++;
    }

    public void getAll() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }

    public T get(int i) {
        return vetor[i];
    }

    public boolean remove(int i) {
        boolean aux = false;

        int cont = 0;
        for (int j = 0; j <= nroElem; j++) {
            if (j != i) {
                vetor[cont] = vetor[j];
                cont++;
            } else {
                nroElem--;
                aux = true;
            }
        }

        return aux;
    }

    public boolean removeElement(T e) {
        boolean aux = false;

        int cont = 0;
        for (int j = 0; j <= nroElem; j++) {
            if (!vetor[j].equals(e)) {
                vetor[cont] = vetor[j];
                cont++;
            } else {
                nroElem--;
                aux = true;
            }
        }

        return aux;
    }

    public boolean substitui(T ant, T novo) {
        boolean aux = false;

        for (int i = 0; i <= nroElem; i++) {
            if (vetor[i].equals(ant)) {
                vetor[i] = novo;
                aux = true;
            }
        }

        if (aux == false) {
            System.out.println("Numero não encontrado");
        }

        return aux;
    }

    public int contaOcorrencia(T valor) {
        int cont = 0;

        for (int i = 0; i <= nroElem; i++) {
            if (vetor[i].equals(valor)) {
                cont++;
            }
        }

        return cont;
    }

    public boolean adicionaNoInicio(T valor) {
        if (vetor.length == nroElem) {
            System.out.println("Vetor está cheio");
            return false;
        } else {
            T aux;
                for (int j = 1; j <= nroElem; j++) {
                    aux = vetor[j];
                    vetor[j] = vetor[0];
                    vetor[0] = aux;
                }
            vetor[0] = valor;
            nroElem++;
        }
        return true;
    }
}
