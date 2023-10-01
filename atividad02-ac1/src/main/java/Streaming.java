import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Streaming {
    private JdbcTemplate jdbcTemplate;

    public Streaming(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addMedia(Media media) {
        jdbcTemplate.update("INSERT INTO media (title, genre, type) VALUES (?, ?, ?);",
        media.getTitle(), media.getGenero().toString(), media.getType());
        System.out.println("Adicionado: " + media.getTitle());
    }

    public void exibirMediaList() {
        List<Serie> serieList = jdbcTemplate.query("SELECT * FROM media WHERE type = 'Série';",
                new BeanPropertyRowMapper<>(Serie.class));

        List<Filme> filmeList = jdbcTemplate.query("SELECT * FROM media WHERE type = 'Filme';",
                new BeanPropertyRowMapper<>(Filme.class));

        System.out.println("Lista de mídias disponíveis:");

        for (Serie serie : serieList) {
            System.out.println(serie.getTitle() + " (" + serie.getGenero() + ")");
        }

        for (Filme filme : filmeList) {
            System.out.println(filme.getTitle() + " (" + filme.getGenero() + ")");
        }
    }
}
