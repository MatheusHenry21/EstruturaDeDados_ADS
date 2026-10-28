package estrutura_de_dados.lista_encadeada.boletim_notas;

public class Boletim {
    private String disciplina;
    private int nota;

    public Boletim(String disciplina, int nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return disciplina + " " + nota;
    }
}
