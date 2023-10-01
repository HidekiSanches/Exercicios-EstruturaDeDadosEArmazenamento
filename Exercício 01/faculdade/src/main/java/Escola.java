import java.util.ArrayList;
import java.util.List;

public class Escola {

    private List<Aluno> alunos;

    public Escola() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirTodos() {
        for(Aluno aluno : alunos) {
            System.out.println("===================");
            System.out.println(aluno);
        }
        System.out.println("===================");
    }

    public void exibirAlunoGraduacao() {
        for(Aluno aluno : alunos) {
            if (aluno instanceof AlunoGraduacao) {
                System.out.println("===================");
                System.out.println(aluno);
            }
        }
        System.out.println("===================");
    }

    public void exibirAprovados() {
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() >= 6) {
                System.out.println("===================");
                System.out.println(aluno);
            }
        }
        System.out.println("===================");
    }

    public void buscarAluno(String ra) {
        Boolean aux = true;
        for (Aluno aluno : alunos) {
            if (aluno.getRa().equals(ra)){
                aux = false;
                System.out.println("===================");
                System.out.println(aluno);
            }
        }
        if (aux) {
            System.out.println("Aluno não encontrado");
        }
        System.out.println("===================");
    }

}
