import java.util.Scanner;

public class Exercicio01 {
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("[%d] = %d", i, vetor[i]));
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int[7];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }
        exibirVetor(vetor);
    }
}
