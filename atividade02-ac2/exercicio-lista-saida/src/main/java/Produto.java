public class Produto {
    private int id;
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String categoria;
    private String marca;

    public Produto(int id, int codigo, String nome, double preco, int quantidadeEstoque, String categoria, String marca) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return String.format("%-5d | %-8d | %-20s | %-8.2f | %-5d | %-15s | %-15s",
                id, codigo, nome, preco, quantidadeEstoque, categoria, marca);
    }
}
