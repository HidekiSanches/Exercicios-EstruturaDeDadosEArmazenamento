public class Secretario extends Funcionario{

    private double salario;
    private double extra;

    public Secretario(String cpf, String nome, double salario, double extra) {
        super(cpf, nome);
        this.salario = salario;
        this.extra = extra;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    @Override
    public double calcularSalario() {
        return salario + extra;
    }

    @Override
    public String toString() {
        return String.format("""
                %s
                Salario: %.2f
                Extra: %.2f
                Salario Total: %.2f
                """, super.toString(), salario, extra, calcularSalario());
    }
}
