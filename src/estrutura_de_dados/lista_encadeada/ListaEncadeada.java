package estrutura_de_dados.lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private int tamanho;
    private No<T> fim;
    private final int NAO__ENCONTRADO = -1;

    public void adicionar(T elemento) {
        No<T> celula = new No<>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        }else {
            this.fim.setProximo(celula);
        }

        this.fim = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        if(this.tamanho == 0){
            return "[]";
        }

        No<T> atual = this.inicio;
        sb.append(atual.getElemento()).append(",");
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            if(atual.getProximo() != null) {
                sb.append(atual.getElemento()).append(",");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public void limpar() {

        for(No<T> atual = this.inicio; atual != null;){
            No<T> proximo = atual.getProximo();
            atual.setProximo(null);
            atual.setProximo(null);
            atual = proximo;
        }

        //limpar os elementos e as referencias
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    //metodo de busca
    //buscar por nó, elemento, posicao

    public int buscar(T elemento) {
        No<T> atual = this.inicio;
        int posicao = 0;

        while (atual != null) {
            if(atual.getElemento().equals(elemento)) {
                return posicao;
            }
            posicao++;
            atual = atual.getProximo();
        }
        return NAO__ENCONTRADO;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscarPorNo(posicao).getElemento();
    }

    private No<T> buscarPorNo(int posicao) {
        if(!(posicao >= 0 &&  posicao < tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }

        No<T> noAtual = this.inicio;
        for(int i = posicao; i < tamanho; i++){
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public void adicionaInicio(T elemento) {
        if(this.tamanho == 0){
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.fim = novoNo;
        }else{
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(this.inicio);
            this.inicio = novoNo;
        }
    }

    public void adiciona(int posicao, T elemento) {
        if(posicao < 0 || posicao > tamanho){
            throw new IllegalArgumentException("Posicao invalida");
        }

        if(posicao == 0){
        } else if (posicao == tamanho) {
            this.adicionar(elemento);
        }else {
            No<T> noAnterior = this.buscarPorNo(posicao - 1);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(elemento, proximoNo);

            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }
}
