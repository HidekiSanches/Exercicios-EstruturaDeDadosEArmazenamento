import java.time.LocalDate;

public class Aluno {
    private Integer ra;
    private String nome;
    private String sobrenome;

    public Aluno(Integer ra, String nome, String sobrenome) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
