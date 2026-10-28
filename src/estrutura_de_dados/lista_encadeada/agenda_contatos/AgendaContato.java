package estrutura_de_dados.lista_encadeada.agenda_contatos;

import estrutura_de_dados.mapa.ListaEncadeada;

public class AgendaContato {
    public static void main(String[] args) {
        ListaEncadeada<Contato> contatos = new ListaEncadeada<>();

        //adicionar 6 contatos;
        contatos.adiciona(new Contato("Ana"));
        contatos.adiciona(new Contato("João"));
        contatos.adiciona(new Contato("Maria"));
        contatos.adiciona(new Contato("Pedro"));
        contatos.adiciona(new Contato("Lucas"));
        contatos.adiciona(new Contato("Julia"));

        //exibir todos os contatos;
        System.out.println(contatos);

        //remover o primeiro contato da lista;
        System.out.println(contatos.remove(0));

        //remover o último contato da lista;
        System.out.println(contatos.remove(contatos.getTamanho()-1));

        //exibir a lista após as remoções;
        System.out.println(contatos);

        //informar quantos contatos restaram.
        System.out.println(contatos.getTamanho());
    }
}
