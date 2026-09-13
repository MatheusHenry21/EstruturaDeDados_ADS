package estrutura_de_dados.pilha;

public class TestandoPilha {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>(10);

        //1. empilhe "A"
        //2. empilhe "B"
        //3. empilhe "C"
        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        //4. mostre o elemento do topo
        System.out.println("Topo: " + pilha.topo());

        //5. desempilhe um elemento
        System.out.println("Removendo elemento: " + pilha.desempilha());

        //6. mostre novamente o topo
        System.out.println("Topo: " + pilha.topo());
    }
}
