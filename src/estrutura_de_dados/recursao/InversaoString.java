package estrutura_de_dados.recursao;

public class InversaoString {
    public static String inverter(String texto) {
        return inverter(texto, texto.length() - 1);
    }

    private static String inverter(String texto, int indice) {
        if (indice < 0) {
            return "";
        }

        return texto.charAt(indice) + inverter(texto, indice - 1);
    }

    public static void main(String[] args) {
        System.out.println(inverter("java"));
    }
}