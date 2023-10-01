import configuration.Conexao;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();

        con.execute("DROP TABLE IF EXISTS media;");
        con.execute("CREATE TABLE media (title VARCHAR(255), genre VARCHAR(20), type VARCHAR(10));");

        Scanner scanner = new Scanner(System.in);
        Streaming streaming = new Streaming(con);

        boolean continuar = true;
        do {
            System.out.println("Bem-vindo ao SimulStream!");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar série");
            System.out.println("2 - Adicionar filme");
            System.out.println("3 - Mostrar lista de mídias");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título da série:");
                    String serieTitle = scanner.nextLine();
                    System.out.println("Escolha o gênero da série:");
                    for (int i = 0; i < Genero.values().length; i++) {
                        System.out.println((i + 1) + " - " + traducaoGenero(Genero.values()[i]));
                    }
                    int generoIndex = scanner.nextInt() - 1;
                    Genero serieGenero = Genero.values()[generoIndex];
                    String serieType = "Série";
                    Serie serie = new Serie(serieTitle, serieGenero, serieType);
                    streaming.addMedia(serie);
                    break;
                case 2:
                    System.out.println("Digite o título do filme:");
                    String filmeTitle = scanner.nextLine();
                    System.out.println("Escolha o gênero do filme:");
                    for (int i = 0; i < Genero.values().length; i++) {
                        System.out.println((i + 1) + " - " + traducaoGenero(Genero.values()[i]));
                    }
                    int filmeGenreIndex = scanner.nextInt() - 1;
                    Genero filmeGenre = Genero.values()[filmeGenreIndex];
                    String filmeType = "Filme";
                    Filme filme = new Filme(filmeTitle, filmeGenre, filmeType);
                    streaming.addMedia(filme);
                    break;
                case 3:
                    streaming.exibirMediaList();
                    break;
                case 4:
                    System.out.println("Obrigado por usar o SimulStream!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (continuar);
    }

    private static String traducaoGenero(Genero genre) {
        switch (genre) {
            case ACAO:
                return "Ação";
            case COMEDIA:
                return "Comédia";
            case DRAMA:
                return "Drama";
            case FANTASIA:
                return "Fantasia";
            case TERROR:
                return "Terror";
            case ROMANCE:
                return "Romance";
            case FICCAO_CIENTIFICA:
                return "Ficção Científica";
            default:
                return "Desconhecido";
        }
    }
}
