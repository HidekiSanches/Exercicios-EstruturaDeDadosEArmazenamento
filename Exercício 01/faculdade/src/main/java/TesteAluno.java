import java.sql.SQLOutput;

public class TesteAluno {

    public static void main(String[] args) {

        AlunoFundamental alunoFundamental = new AlunoFundamental(
                "123321",
                "Thiago",
                10.0,
                9.0,
                10.0,
                8.0
        );

        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(
                "123321",
                "Hideki",
                10.0,
                7.0
        );

        AlunosPos alunosPos = new AlunosPos(
                "123321",
                "Sasaoka",
                10.0,
                9.0,
                8.0
        );

        Escola escola = new Escola();

        escola.adicionarAluno(alunoFundamental);
        escola.adicionarAluno(alunoGraduacao);
        escola.adicionarAluno(alunosPos);

        System.out.println("BUSCAR");
        escola.buscarAluno("123321");
        System.out.println("GRADUAÇÃO");
        escola.exibirAlunoGraduacao();
        System.out.println("APROVADOS");
        escola.exibirAprovados();
        System.out.println("TODOS");
        escola.exibirTodos();
    }

}
