public class Ordenacao {

    public static void main(String[] args) {
        int[] vet = {1, 5, 8, 6, 2, 4, 3, 7};
        boubleSort(vet);
        System.out.println("Array ordenado:");
        for (int num : vet) {
            System.out.println(num + " ");
        }
        System.out.println("====================");
        System.out.println(pesquisaBinaria(vet, 4));
        System.out.println("====================");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void boubleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static int pesquisaBinaria(int[] vet, int num) {
        int indinf = 0;
        int indsup = vet.length - 1;

        while (indinf <= indsup) {
            int meio = (indinf + indsup) / 2;

            if (vet[meio] == num) {
                return meio;
            } else if (num < vet[meio]) {
                indsup = meio - 1;
            } else {
                indinf = meio + 1;
            }
        }

        return -1;
    }
}
