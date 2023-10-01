import java.util.Scanner;

public class Exercicio03 {
    public static void  exibirVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("[%d] = %s", i, vetor[i]));
        }
    }

    public static void main(String[] args) {
        String[] vetor = new String[10];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um nome: ");
            vetor[i] = leitor.next();
        }

        System.out.println("=============");
        exibirVetor(vetor);
        System.out.println("=============");

        System.out.println("Procure um nome: ");
        String nome = leitor.next();

        boolean aux = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(nome)){
                aux = true;
                System.out.println(String.format("Nome encontrado no índice %d", i));
            }
        }

        if (!aux) {
            System.out.println("Nome não encontrado");
        }
    }
}
