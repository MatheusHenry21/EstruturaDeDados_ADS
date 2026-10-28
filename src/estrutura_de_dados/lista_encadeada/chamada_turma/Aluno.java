package estrutura_de_dados.lista_encadeada.chamada_turma;

public class Aluno {
    private String nome;
    private String matricula;

    public Aluno(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
