package estrutura_de_dados.lista_encadeada.lista_convidados;

public class Convidado {
    private String nome;
    private String cpf;

    public Convidado(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
