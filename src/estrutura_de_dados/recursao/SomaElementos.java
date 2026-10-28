package estrutura_de_dados.recursao;

public class SomaElementos {
    public static int somar(int[] numeros) {
        return somar(numeros, 0);
    }

    private static int somar(int[] numeros, int indice) {
        if (indice == numeros.length) {
            return 0;
        }

        return numeros[indice] + somar(numeros, indice + 1);
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};

        System.out.println(somar(numeros)); // 10
    }
}

