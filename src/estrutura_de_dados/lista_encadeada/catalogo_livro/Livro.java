package estrutura_de_dados.lista_encadeada.catalogo_livro;

import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private Date dataPublicacao;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
