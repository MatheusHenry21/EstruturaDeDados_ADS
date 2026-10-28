package estrutura_de_dados.mapa;

import java.util.Map;

public class InverterMapa {
    public static void main(String[] args){
        Mapa<Integer, String> original = new Mapa<>();
        original.inserir(1, "A");
        original.inserir(2, "B");
        original.inserir(3, "C");

        Mapa<String, Integer> invertido = new Mapa<>();

        ListaEncadeada<Integer> chaves = original.chaves();

        for (int i = 0; i < chaves.getTamanho(); i++) {
            Integer chave = chaves.buscaPorPosicao(i);
            String valor = original.busca(chave);

            invertido.inserir(valor, chave);
        }

        System.out.println(invertido);
    }
}
