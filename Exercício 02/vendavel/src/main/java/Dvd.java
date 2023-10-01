public class Dvd extends Produto{
    private String nome;
    private String gravadora;

    public Dvd(int codigo, double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public double getValorVenda() {
        return getPrecoCusto() + (0.20 * getPrecoCusto());
    }

    @Override
    public String toString() {
        return String.format("\n" +
                "%s \n" +
                "Nome: %s \n" +
                "Gravadora: %s",
                super.toString(),
                nome,
                gravadora
        );
    }
}
