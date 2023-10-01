public class Service implements Vendavel{
    private String descricao;
    private int codigo;
    private int qtdHoras;
    private double valorHora;

    public Service(String descricao, int codigo, int qtdHoras, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double getValorVenda() {
        return qtdHoras * valorHora;
    }

    @Override
    public String toString() {
        return String.format("" +
                "Codigo: %d \n" +
                "Descrição: %s \n" +
                "Qtd. Horas: %d \n" +
                "Valor Hora: %.2f",
                codigo,
                descricao,
                qtdHoras,
                valorHora);
    }
}
