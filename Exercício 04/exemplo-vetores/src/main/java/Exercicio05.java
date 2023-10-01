import java.util.Arrays;
import java.util.Scanner;

public class Exercicio05 {
    public static void  exibirVetor(String[] vetor, double[] rendimento) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("%s = %.2f", vetor[i], rendimento[i]));
        }
    }

    public static void main(String[] args) {
        String[] vetor = new String[5];
        double[] rendimento = new double[5];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um modelo de carro: ");
            vetor[i] = leitor.next();
            System.out.println("Digite o rendimento do carro: ");
            rendimento[i] = leitor.nextInt();
        }

        for (int i = 1; i < rendimento.length; i++) {
            for (int j = 0; j < i; j++) {
                if (rendimento[i] > rendimento[j]) {
                    double temp = rendimento[i];
                    String aux = vetor[i];

                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                    rendimento[i] = rendimento[j];
                    rendimento[j] = temp;
                }
            }
        }

        exibirVetor(vetor, rendimento);
    }
}
