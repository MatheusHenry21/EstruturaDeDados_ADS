package estrutura_de_dados.mapa;

public class Mapa<K, V> {
  private ListaEncadeada<Associacao<K, V>> lista;

  public Mapa() {
    this.lista = new ListaEncadeada<>();
  }

  public boolean estaVazio() {
    return lista.getTamanho() == 0;
  }

  @Override
  public String toString() {
    return "Mapa " + lista.toString();
  }

  public int tamanho(){
    return lista.getTamanho();
  }

  public V inserir(K chave, V valor) {
    for (int i = 0; i < lista.getTamanho(); i++) {
      Associacao<K, V> associacao = lista.buscaPorPosicao(i);

      if(associacao.getChave().equals(chave)){
        V valorAntigo = associacao.getValue();
        associacao.setValue(valor);
        return valorAntigo;
      }
    }
    lista.adiciona(new Associacao<>(chave, valor));
    return null;
  }

  public V busca(K chave) {
    for (int i = 0; i < lista.getTamanho(); i++) {
      Associacao<K, V> associacao = lista.buscaPorPosicao(i);
      if(associacao.getChave().equals(chave)){
        return associacao.getValue();
      }
    }
    return null;
  }

  public V remover(K chave) {
    V valor = null;
    for (int i = 0; i < lista.getTamanho(); i++) {
      Associacao<K, V> associacao = lista.buscaPorPosicao(i);
      if(associacao.getChave().equals(chave)){
        valor = associacao.getValue();
        lista.remove(i);
      }
    }
    return valor;
  }

  public ListaEncadeada<K> chaves(){
    ListaEncadeada<K> listaChaves = new ListaEncadeada<>();

    for (int i = 0; i < lista.getTamanho(); i++) {
      Associacao<K, V> associacao = lista.buscaPorPosicao(i);
      listaChaves.adiciona(associacao.getChave());
    }
    return listaChaves;
  }

  public ListaEncadeada<V> valores(){
    ListaEncadeada<V> listaValores = new ListaEncadeada<>();

    for (int i = 0; i < lista.getTamanho(); i++) {
      Associacao<K, V> associacao = lista.buscaPorPosicao(i);
      listaValores.adiciona(associacao.getValue());
    }
    return listaValores;
  }
}
