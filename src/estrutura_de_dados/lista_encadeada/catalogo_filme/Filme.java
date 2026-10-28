package estrutura_de_dados.lista_encadeada.catalogo_filme;

import java.util.Date;

public class Filme {
    private String titulo;
    private String genero;
    private Date dataLancamento;

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
