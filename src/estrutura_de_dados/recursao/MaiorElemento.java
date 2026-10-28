package estrutura_de_dados.recursao;

public class MaiorElemento {
    public static int encontrarMaior(int[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("O vetor não pode estar vazio.");
        }

        return encontrarMaior(numeros, 0);
    }

    private static int encontrarMaior(int[] numeros, int indice) {
        if (indice == numeros.length - 1) {
            return numeros[indice];
        }

        int maiorRestante = encontrarMaior(numeros, indice + 1);

        if (numeros[indice] > maiorRestante) {
            return numeros[indice];
        }

        return maiorRestante;
    }

    public static void main(String[] args) {
        int[] numeros = {3, 9, 2, 15, 7};

        System.out.println(encontrarMaior(numeros)); // 15
    }
}
