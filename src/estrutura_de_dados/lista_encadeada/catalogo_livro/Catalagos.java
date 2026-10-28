package estrutura_de_dados.lista_encadeada.catalogo_livro;

import estrutura_de_dados.mapa.ListaEncadeada;

public class Catalagos {
    public static void main(String[] args) {
        ListaEncadeada<Livro> livros = new ListaEncadeada<>();

        //cadastrar 5 livros;
        livros.adiciona(new Livro("O Mulato"));
        livros.adiciona(new Livro("Harry Potter"));
        livros.adiciona(new Livro("Casa Verde"));
        livros.adiciona(new Livro("O Quinze"));
        livros.adiciona(new Livro("O Pequeno Príncipe"));

        //mostrar todos os livros;
        System.out.println(livros);

        //adicionar um novo livro no início da lista;
        livros.adicionaInicio(new Livro("Python Fluente"));

        //adicionar um novo livro no final da lista;
        livros.adiciona(new Livro("Inteligencia Emocional"));

        //exibir o primeiro e o último livro cadastrados.
        System.out.println(livros.buscaPorPosicao(0));
        System.out.println(livros.buscaPorPosicao(livros.getTamanho()-1));
    }
}
