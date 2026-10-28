package estrutura_de_dados.lista_encadeada.playlist;

import estrutura_de_dados.mapa.ListaEncadeada;

public class PlayList {
    public static void main(String[] args) {
        ListaEncadeada<Musica> musicas = new ListaEncadeada<>();

        //adicionar 6 músicas
        musicas.adiciona(new Musica("Os Anjos"));
        musicas.adiciona(new Musica("Infiel"));
        musicas.adiciona(new Musica("This I Love"));
        musicas.adiciona(new Musica("Sala de reboco"));
        musicas.adiciona(new Musica("Mega Sena"));

        Musica olhar43 = new Musica("Olhar 43");
        musicas.adiciona(olhar43);

        //exibir a playlist completa;
        System.out.println(musicas);

        //verificar se uma música específica está na lista;
        int num = musicas.busca(olhar43);
        if (num >= 0) {
            System.out.println("Música encontrada");
        }else {
            System.out.println("Não encontrada");
        }

        //mostrar quantas músicas existem ao todo
        System.out.println(musicas.getTamanho());
    }
}
