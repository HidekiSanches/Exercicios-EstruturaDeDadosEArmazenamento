import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaObj<Produto> listaProdutos = new ListaObj<>(5);
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1 - Adicionar um objeto na lista (cadastro)");
            System.out.println("2 - Exibir os objetos cadastrados (relatório)");
            System.out.println("3 - Fim do programa (encerrar)");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Produto novoProduto = cadastrarProduto(scanner);
                    listaProdutos.adiciona(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    exibirRelatorio(listaProdutos);
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
    }

    private static Produto cadastrarProduto(Scanner scanner) {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        System.out.print("Categoria: ");
        String categoria = scanner.next();
        System.out.print("Marca: ");
        String marca = scanner.next();

        return new Produto(id, codigo, nome, preco, quantidadeEstoque, categoria, marca);
    }

    private static void exibirRelatorio(ListaObj<Produto> listaProdutos) {
        System.out.println("\n===== Relatório de Produtos =====");
        System.out.printf("%-5s | %-8s | %-20s | %-8s | %-5s | %-15s | %-15s\n",
                "ID", "Código", "Nome", "Preço", "Estoque", "Categoria", "Marca");
        System.out.println("-----------------------------------------------------------------------------------------------");

        for (int i = 0; i < listaProdutos.getTamanho(); i++) {
            System.out.printf(listaProdutos.getElemento(i).toString() + "\n");
        }
    }
}






