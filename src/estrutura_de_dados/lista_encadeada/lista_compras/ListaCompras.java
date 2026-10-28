package estrutura_de_dados.lista_encadeada.lista_compras;

import estrutura_de_dados.mapa.ListaEncadeada;

public class ListaCompras {
    public static void main(String[] args) {
        ListaEncadeada<Item> lista = new ListaEncadeada<>();

        //adicionar 7 itens;
        lista.adiciona(new Item("Açucar"));
        lista.adiciona(new Item("Feijão"));
        lista.adiciona(new Item("Arroz"));
        lista.adiciona(new Item("Cuscuz"));
        lista.adiciona(new Item("Sabão"));
        lista.adiciona(new Item("Detergente"));
        Item calabresa = new Item("Calabresa");
        lista.adiciona(calabresa);

        //exibir todos os itens da lista;
        System.out.println(lista);

        //mostrar o item que está em uma posição informada;
        System.out.println(lista.buscaPorPosicao(5));

        //verificar se um determinado produto foi adicionado;
        int num = lista.busca(calabresa);
        if (num >= 0) {
            System.out.println("Produto encontrado");
        }else {
            System.out.println("Não encontrado");
        }

        //contar quantos itens foram cadastrados.
        System.out.println(lista.getTamanho());
    }
}
