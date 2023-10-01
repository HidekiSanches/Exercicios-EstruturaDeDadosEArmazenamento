public class Lista {

    int[] vetor;
    int nroElem;

    public Lista(int tamanho) {
        this.vetor = new int[tamanho];
        this.nroElem = 0;
    }

    public void add(int num) {
        vetor[nroElem] = num;
        nroElem++;
    }

    public void getAll() {
        for (int i = 0; i < nroElem; i++) {
            System.out.println(vetor[i]);
        }
    }

    public int get(int i) {
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

    public boolean removeElement(int e) {
        boolean aux = false;

        int cont = 0;
        for (int j = 0; j <= nroElem; j++) {
            if (vetor[j] != e) {
                vetor[cont] = vetor[j];
                cont++;
            } else {
                nroElem--;
                aux = true;
            }
        }

        return aux;
    }
}