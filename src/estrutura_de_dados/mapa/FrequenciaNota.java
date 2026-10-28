package estrutura_de_dados.mapa;

import estrutura_de_dados.vetor.Vetor;

public class FrequenciaNota {
    public static void main(String[] args) {
        Mapa<Integer, Integer> mapa = new Mapa();
        int[] numeros = {7, 8, 7, 10, 8, 7};

        for(int i = 0; i < numeros.length; i++){
            if(mapa.busca(numeros[i]) == null){
                mapa.inserir(numeros[i], 1);
                continue;
            }
            int num = mapa.busca(numeros[i]);
            num++;
            mapa.inserir(numeros[i], num);
        }

        System.out.println(mapa.toString());
    }
}
