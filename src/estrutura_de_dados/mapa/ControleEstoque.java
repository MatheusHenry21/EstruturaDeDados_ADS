package estrutura_de_dados.mapa;

public class ControleEstoque {
    public static void main(String[] args) {
        Mapa<String, Integer> mapa = new Mapa<>();

        //Inserir produtos no estoque
        mapa.inserir("Feijão", 20);
        mapa.inserir("Farinha", 22);
        mapa.inserir("Açúcar", 18);
        mapa.inserir("Macarrão", 25);
        mapa.inserir("Café", 12);
        mapa.inserir("Óleo", 16);
        mapa.inserir("Farinha", 22);

        //Simular a venda de um produto (diminuir quantidade)
        mapa.inserir("Feijão", 13);
        mapa.inserir("Macarrão", 20);
        mapa.inserir("Farinha", 21);
        mapa.inserir("Farinha", 16);

        System.out.println("Estoque: " + mapa.toString());
    }
}
