public class Turma {
    private String nome;
    private Aluno[] alunos;
    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new Aluno[10];
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno a, Integer i) {
        alunos[i] = a;
    }

    public void exibirAlunos(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(alunos[i]);
        }
    }
}
