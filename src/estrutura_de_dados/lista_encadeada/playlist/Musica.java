package estrutura_de_dados.lista_encadeada.playlist;

public class Musica {
    private String titulo;
    private String artista;

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
