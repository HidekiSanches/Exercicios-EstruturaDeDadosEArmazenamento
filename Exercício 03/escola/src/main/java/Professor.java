public class Professor extends Funcionario implements Bonus{

    private int qtdAulas;
    private double valorHora;

    public Professor(String cpf, String nome, int qtdAulas, double valorHora) {
        super(cpf, nome);
        this.qtdAulas = qtdAulas;
        this.valorHora = valorHora;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(int qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return qtdAulas * valorHora * 4.5;
    }

    @Override
    public double getValorBonus() {
        return calcularSalario() * 0.15;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Qtd. Aulas: %d
                Valor Hora: %.2f
                Salario: %.2f
                Bonus: %.2f
                """, super.toString(), qtdAulas, valorHora, calcularSalario(), getValorBonus());
    }
}
