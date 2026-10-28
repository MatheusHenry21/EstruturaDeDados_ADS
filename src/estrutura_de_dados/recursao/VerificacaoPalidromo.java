package estrutura_de_dados.recursao;

public class VerificacaoPalidromo {
    public static boolean ehPalindromo(String palavra) {
        return verificar(palavra, 0, palavra.length() - 1);
    }

    private static boolean verificar(String palavra, int inicio, int fim) {
        if (inicio >= fim) {
            return true; // Todos os pares de caracteres combinaram
        }

        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        }

        return verificar(palavra, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        System.out.println(ehPalindromo("arara")); // true
    }
}
