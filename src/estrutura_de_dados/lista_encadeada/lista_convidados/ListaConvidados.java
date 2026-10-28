package estrutura_de_dados.lista_encadeada.lista_convidados;

import estrutura_de_dados.mapa.ListaEncadeada;

public class ListaConvidados {
    public static void main(String[] args) {
        ListaEncadeada<Convidado> convidados = new ListaEncadeada<>();

        //cadastrar 6 convidados;
        convidados.adiciona(new Convidado("Ana"));
        convidados.adiciona(new Convidado("João"));
        convidados.adiciona(new Convidado("Maria"));
        convidados.adiciona(new Convidado("Pedro"));
        convidados.adiciona(new Convidado("Lucas"));
        convidados.adiciona(new Convidado("Julia"));

        //adicionar um convidado no início da lista;
        convidados.adicionaInicio(new Convidado("Paula"));

        //adicionar um convidado em uma posição específica;
        Convidado ricardo = new Convidado("Ricardo");
        convidados.adiciona(5, ricardo);

        //exibir a lista completa;
        System.out.println(convidados);

        //verificar se um convidado específico está cadastrado;
        int num = convidados.busca(ricardo);
        if (num != -1) {
            System.out.println("Convidado encontrado");
        }else {
            System.out.println("Não encontrado");
        }

        //informar o número total de convidados.
        System.out.println(convidados.getTamanho());
    }
}
