import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Procure o número: ");
        int numero = leitor.nextInt();

        boolean aux = false;
        int vezes = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                aux = true;
                vezes++;
            }
        }

        if (aux) {
            System.out.println(String.format("o número %d ocorre %d vezes", numero, vezes));
        } else {
            System.out.println(String.format("o número %d não ocorre nenhuma vez", numero));
        }
    }
}
