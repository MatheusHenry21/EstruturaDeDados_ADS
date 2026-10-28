package estrutura_de_dados.mapa;

public class MapaTeste {

    public static void main(String[] args) {
        Mapa<Integer, String> mapa = new Mapa<>();
        System.out.println("Está vazio? " + mapa.estaVazio());
        System.out.println(mapa);

        System.out.println("\nInserindo elementos...");
        System.out.println("inserir(5, A) -> " + mapa.inserir(5, "A"));
        System.out.println("inserir(7, B) -> " + mapa.inserir(7, "B"));
        System.out.println("inserir(2, C) -> " + mapa.inserir(2, "C"));
        System.out.println("inserir(8, D) -> " + mapa.inserir(8, "D"));

        System.out.println("\nEstá vazio? " + mapa.estaVazio());

        System.out.println(mapa);

        System.out.println("\nAtualizando chave existente...");
        System.out.println("inserir(2, E) -> " + mapa.inserir(2, "E"));
        System.out.println("Tamanho: " + mapa.tamanho());
        System.out.println(mapa);

        System.out.println("\nBuscando valores...");
        System.out.println("buscar(7) -> " + mapa.busca(7));
        System.out.println("buscar(4) -> " + mapa.busca(4));
        System.out.println("buscar(2) -> " + mapa.busca(2));

        System.out.println("\nTamanho do mapa: " + mapa.tamanho());

        System.out.println("\nRemovendo elementos...");
        System.out.println("remover(5) -> " + mapa.remover(5));
        System.out.println("remover(2) -> " + mapa.remover(2));

        System.out.println("\nBuscar após remoção...");
        System.out.println("buscar(2) -> " + mapa.busca(2));

        System.out.println("\nChaves: " + mapa.chaves());
        System.out.println("Valores: " + mapa.valores());

        System.out.println("\nAssociações:");
        System.out.println(mapa);

    }
}

