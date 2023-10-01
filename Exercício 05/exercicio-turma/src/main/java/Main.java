import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Turma turma1 = new Turma("Turma-A");
        Turma turma2= new Turma("Turma-B");

        Scanner leitor = new Scanner(System.in);

        int aux = 0;
        int t1 = 0;
        int t2 = 0;
        do {
            System.out.println("========================");
            System.out.println("C A D A S T R O");
            System.out.println("========================");
            System.out.println("RA do aluno:");

            Integer ra = leitor.nextInt();

            System.out.println("Nome do aluno:");

            String nome = leitor.next();

            System.out.println("Sobrenome do aluno:");

            String sobrenome = leitor.next();

            System.out.println("Qual é a turma do aluno");
            System.out.println("1 - Turma-A");
            System.out.println("2 - Tumar-B");

            Integer turma = leitor.nextInt();
            switch (turma) {
                case 1:
                    turma1.addAluno(new Aluno(ra, nome, sobrenome), t1);
                    System.out.println("Cadastro realizado com sucesso!!!");
                    t1++;
                    aux++;
                    break;
                case 2 :
                    turma2.addAluno(new Aluno(ra, nome, sobrenome), t2);
                    System.out.println("Cadastro realizado com sucesso!!!");
                    t2++;
                    aux++;
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (aux < 10);

        System.out.println("========================");
        System.out.println("T U R M A - A");
        System.out.println("========================");

        turma1.exibirAlunos(t1);

        System.out.println("========================");
        System.out.println("T U R M A - B");
        System.out.println("========================");

        turma2.exibirAlunos(t2);
    }

}
