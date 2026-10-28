package estrutura_de_dados.mapa;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Mapa<String, String> mapa = new Mapa<>();

        //Adicionar pelo menos 4 contatos
        mapa.inserir("Matheus", "87900000000");
        mapa.inserir("Ana", "87900000001");
        mapa.inserir("Pedro", "87900000002");
        mapa.inserir("Julia", "87900000003");

        //Buscar o telefone de um contato
        System.out.println(mapa.busca("Matheus"));

        //Remover um contato
        System.out.println(mapa.remover("Julia"));

        //Exibir todos os contatos
        System.out.println(mapa.toString());
    }
}
