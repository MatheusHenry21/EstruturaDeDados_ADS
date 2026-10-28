package estrutura_de_dados.mapa;

import java.util.Scanner;

public class ContadorPalavra {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Mapa<String, Integer> mapa = new Mapa<>();

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        for (String palavra : frase.trim().split("\\s+")) {
            if (palavra.isEmpty()) {
                continue;
            }

            Integer quantidade = mapa.busca(palavra);

            if (quantidade == null) {
                mapa.inserir(palavra, 1);
            } else {
                mapa.inserir(palavra, quantidade + 1);
            }
        }

        ListaEncadeada<String> chaves = mapa.chaves();

        for (int i = 0; i < chaves.getTamanho(); i++) {
            String palavra = chaves.buscaPorPosicao(i);
            System.out.println(palavra + " → " + mapa.busca(palavra));
        }

        sc.close();
    }
}