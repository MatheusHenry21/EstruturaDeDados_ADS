package estrutura_de_dados.mapa;

public class Associacao<K, V> {
  private K chave;
  private V value;

  public Associacao(K chave, V value) {
    this.chave = chave;
    this.value = value;
  }

  public K getChave() {
    return chave;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "{" + chave + ", " + value + "}";
  }
}
