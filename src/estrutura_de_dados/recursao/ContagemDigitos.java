package estrutura_de_dados.recursao;

public class ContagemDigitos {
    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        }

        return 1 + contarDigitos(numero / 10);
    }

    public static void main(String[] args) {
        System.out.println(contarDigitos(12345)); // 5
    }
}
