package estrutura_de_dados.lista_encadeada.agenda_contatos;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
