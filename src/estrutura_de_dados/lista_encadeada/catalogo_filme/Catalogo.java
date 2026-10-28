package estrutura_de_dados.lista_encadeada.catalogo_filme;

import estrutura_de_dados.mapa.ListaEncadeada;

public class Catalogo {
    public static void main(String[] args) {
        ListaEncadeada<Filme> filmes = new ListaEncadeada<>();

        //adicionar 5 filmes;
        filmes.adiciona(new Filme("Toy Story"));
        filmes.adiciona(new Filme("Shrek"));
        filmes.adiciona(new Filme("Procurando Nemo"));
        filmes.adiciona(new Filme("O Rei Leão"));
        filmes.adiciona(new Filme("Carros"));

        //exibir todos os filmes;
        System.out.println(filmes);

        //adicionar um novo filme em uma posição específica;
        Filme titanic = new Filme("Titanic");
        filmes.adiciona(3, titanic);

        //verificar se um determinado filme está cadastrado;
        int num = filmes.busca(titanic);
        if (num != -1) {
            System.out.println("Filme encontrado");
        }else {
            System.out.println("Não encontrado");
        }

        //remover um filme de uma posição informada;
        filmes.remove(1);

        //exibir a lista após a remoção;
        System.out.println(filmes);

        //limpar completamente a lista;
        filmes.limpa();

        //informar o tamanho da lista após a limpeza.
        System.out.println(filmes.getTamanho());
    }
}
