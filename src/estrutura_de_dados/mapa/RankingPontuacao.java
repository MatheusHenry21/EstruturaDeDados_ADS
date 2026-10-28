package estrutura_de_dados.mapa;

import java.util.Map;

public class RankingPontuacao {
    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>();

        //Inserir pelo menos 4 jogadores
        mapa.inserir("Matheus", 10);
        mapa.inserir("Felipe", 8);
        mapa.inserir("João", 4);
        mapa.inserir("Wesley", 9);

        //Atualizar a pontuação de um jogador
        mapa.inserir("João", 6);

        //Exibir o jogador com maior pontuação
        System.out.println(mapa.toString());
    }
}
