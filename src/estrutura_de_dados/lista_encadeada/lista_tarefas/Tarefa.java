package estrutura_de_dados.lista_encadeada.lista_tarefas;

import estrutura_de_dados.lista_encadeada.catalogo_livro.Livro;

public class Tarefa {
    private String descricao;
    private int prioridade;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
