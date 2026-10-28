package estrutura_de_dados.lista_encadeada.lista_tarefas;

import estrutura_de_dados.mapa.ListaEncadeada;

public class ListaTarefa {
    public static void main(String[] args) {
        ListaEncadeada<Tarefa> lista = new ListaEncadeada();

        //adicionar 8 tarefas;
        lista.adiciona(new Tarefa("Estudar"));
        lista.adiciona(new Tarefa("Escrever"));
        lista.adiciona(new Tarefa("Trabalhar"));
        lista.adiciona(new Tarefa("Caminhar"));
        lista.adiciona(new Tarefa("Cozinhar"));
        lista.adiciona(new Tarefa("Limpar"));
        lista.adiciona(new Tarefa("Descansar"));
        Tarefa ler = new Tarefa("Ler");
        lista.adiciona(ler);

        //exibir todas as tarefas;
        System.out.println(lista);

        //verificar se uma tarefa específica está na lista;
        int num = lista.busca(ler);
        if (num == -1) {
            System.out.println("Não encontrado");
        }else {
            System.out.println("Tarefa encontrada");
        }

        //mostrar a última tarefa cadastrada;
        System.out.println(lista.buscaPorPosicao(lista.getTamanho()-1));

        //informar a quantidade total de tarefas.
        System.out.println(lista.getTamanho());
    }
}
