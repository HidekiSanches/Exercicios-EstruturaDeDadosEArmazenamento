import java.util.Scanner;

public class TesteVetores {

    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("[%d] = %d", i, vetor[i]));
        }
    }

    public static void  exibirVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(String.format("[%d] = %s", i, vetor[i]));
        }
    }

    public static void main(String[] args) {
        //criando um vetor de inteiros
        int[] vetor01 = new int[10];

        //criando e inicializando um vetor
        int[] vetor02 = {100, 200, 300, 400, 500};

        String[] vetor03 = new String[4];

        //alterando valores do vetor01
        for (int i = 0; i < vetor01.length; i++) {
            vetor01[i] = i * 10;
        }

        // exibindo os valores do vetor
        for (int i = 0; i < vetor01.length; i++) {
            System.out.println(String.format("[%d] = %d", i, vetor01[i]));
        }

        System.out.println("=================");
        exibirVetor(vetor01);
        System.out.println("=================");
        exibirVetor(vetor02);
        System.out.println("=================");

        //Desafio: preencha o vetor03 com nomes digitados pelo usuários

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < vetor03.length; i ++) {
            System.out.print("Informe uma palavra: ");
            vetor03[i] = leitor.next();
        }

        exibirVetor(vetor03);

        System.out.println("=================");
    }

}
