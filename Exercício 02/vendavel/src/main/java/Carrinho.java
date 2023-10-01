import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarVendavel(Vendavel v) {
        produtos.add(v);
    }

    public double calculaTotalVenda() {
        double aux = 0.0;
        for (Vendavel produto: produtos) {
            aux += produto.getValorVenda();
        }
        return aux;
    }

    public void exibiItensCarrinho() {
        for (Vendavel produto: produtos) {
            System.out.println("=============================");
            System.out.println(produto);
        }
        System.out.println("=============================");
    }

}
