package estrutura_de_dados.lista_encadeada.estoque_produtos;

import estrutura_de_dados.mapa.ListaEncadeada;

public class EstoqueProdutos {
    public static void main(String[] args) {
        ListaEncadeada<Produto> produtos = new ListaEncadeada<>();

        //adicionar 5 produtos;
        produtos.adiciona(new Produto("Arroz"));
        produtos.adiciona(new Produto("Feijão"));
        produtos.adiciona(new Produto("Leite"));
        produtos.adiciona(new Produto("Pão"));
        produtos.adiciona(new Produto("Açúcar"));

        //exibir todos os produtos;
        System.out.println(produtos);

        //mostrar o produto que está em uma determinada posição;
        System.out.println(produtos.buscaPorPosicao(3));

        //adicionar um novo produto em uma posição específica;
        Produto sabao = new Produto("Sabao");
        produtos.adiciona(2, sabao);

        //verificar se um produto existe no estoque;
        int num = produtos.busca(sabao);
        if (num != -1) {
            System.out.println("Convidado encontrado");
        }else {
            System.out.println("Não encontrado");
        }

        //mostrar o primeiro e o último produto cadastrados.
        System.out.println(produtos.buscaPorPosicao(0));
        System.out.println(produtos.buscaPorPosicao(produtos.getTamanho()-1));
    }
}
