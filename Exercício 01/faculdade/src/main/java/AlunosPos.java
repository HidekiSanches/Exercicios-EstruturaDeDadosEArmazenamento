public class AlunosPos extends Aluno{

    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunosPos(String ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calcularMedia() {
        return (nota1 + nota2 + notaMonografia) / 3;
    }

    @Override
    public String toString() {
        return String.format("%s \n" +
                "Primeira Nota: %.1f \n" +
                "Segunda Nota: %.1f \n" +
                "Monográfia: %.1f \n" +
                "Média: %.2f",
                super.toString(),
                nota1,
                nota2,
                notaMonografia,
                calcularMedia()
        );
    }
}
