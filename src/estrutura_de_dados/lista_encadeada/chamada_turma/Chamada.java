package estrutura_de_dados.lista_encadeada.chamada_turma;

import estrutura_de_dados.mapa.ListaEncadeada;

public class Chamada {
    public static void main(String[] args) {
        ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();

        //adicionar 5 alunos na lista;
        alunos.adiciona(new Aluno("Marcelo"));
        alunos.adiciona(new Aluno("Lucas"));
        alunos.adiciona(new Aluno("Alex"));
        alunos.adiciona(new Aluno("Pedro"));
        alunos.adiciona(new Aluno("Julio"));

        //mostrar todos os alunos cadastrados;
        System.out.println(alunos);

        //mostrar o primeiro aluno da lista;
        System.out.println(alunos.buscaPorPosicao(0));

        //mostrar o último aluno da lista;
        System.out.println(alunos.buscaPorPosicao(alunos.getTamanho()-1));

        //informar quantos alunos existem na lista.
        System.out.println(alunos.getTamanho());
    }
}
