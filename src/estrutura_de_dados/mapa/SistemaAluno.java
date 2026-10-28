package estrutura_de_dados.mapa;

public class SistemaAluno {
    public static void main(String[] args) {
        Mapa<Integer, String> sistema = new Mapa<>();

        //Inserir pelo menos 5 alunos
        sistema.inserir(1, "Matheus");
        sistema.inserir(2, "Ana");
        sistema.inserir(3, "Samuel");
        sistema.inserir(4, "Maria");
        sistema.inserir(5, "Julio");

        //Buscar um aluno pela matrícula
        System.out.println(sistema.busca(2));

        //Remover um aluno
        System.out.println(sistema.remover(4));

        //Exibir todas as chaves e valores
        System.out.println(sistema);
    }
}
