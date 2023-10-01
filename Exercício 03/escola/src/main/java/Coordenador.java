public class Coordenador extends Funcionario implements Bonus{

    private int qtdHoras;
    private double valorhora;
    private int qtdCursos;

    public Coordenador(String cpf, String nome, int qtdHoras, double valorhora, int qtdCursos) {
        super(cpf, nome);
        this.qtdHoras = qtdHoras;
        this.valorhora = valorhora;
        this.qtdCursos = qtdCursos;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public int getQtdCursos() {
        return qtdCursos;
    }

    public void setQtdCursos(int qtdCursos) {
        this.qtdCursos = qtdCursos;
    }

    @Override
    public double calcularSalario() {
        return qtdHoras + valorhora * 4.5 + qtdCursos * 500;
    }

    @Override
    public double getValorBonus() {
        return calcularSalario() * 0.20;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Qtd. Horas: %d
                Valor Hora: %.2f
                Qtd. Cursos: %d
                Salario: %.2f
                Bonus: %.2f
                """, super.toString(), qtdHoras, valorhora, qtdCursos, calcularSalario(), getValorBonus());
    }
}
