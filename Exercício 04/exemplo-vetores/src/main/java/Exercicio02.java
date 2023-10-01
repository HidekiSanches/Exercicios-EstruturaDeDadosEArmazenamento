import java.util.Scanner;

public class Exercicio02 {
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("[%d] = %d", i, vetor[i]));
        }
    }

    public static void exibirMedia(int[] vetor) {
        int media = 0;
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }
        media = media / vetor.length;
        System.out.println(String.format("Média: %d", media));
    }

    public static void main(String[] args) {
        int[] vetor = new int[10];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }

        exibirVetor(vetor);
        exibirMedia(vetor);
    }
}
