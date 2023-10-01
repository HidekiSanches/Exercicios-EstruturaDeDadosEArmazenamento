public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(100, 50.00, "Livro", "Autor", "ISBN");
        Dvd dvd = new Dvd(101, 20.00, "DVD", "Gravadora");
        Service service = new Service("Descrição", 102, 20, 300.0);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarVendavel(livro);
        carrinho.adicionarVendavel(dvd);
        carrinho.adicionarVendavel(service);

        System.out.println("=============================");
        System.out.println(carrinho.calculaTotalVenda());
        System.out.println("=============================");

        carrinho.exibiItensCarrinho();
    }
}
