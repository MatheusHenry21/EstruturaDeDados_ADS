package estrutura_de_dados.vetor;

import estruturadados.vetor.Vetor;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vetor classe = new Vetor(10);

        classe.adiciona("Matheus");
        classe.adiciona("Arthur");
        classe.adiciona("Fernanda");
        classe.adiciona("Rafael");
        classe.adiciona("João");
        classe.adiciona("Juan");

        System.out.println("Alunos da classe: " + classe);

        System.out.println("Quantidade de alunos: " + classe.tamanho());

        boolean encontrado = false;
        for (int i = 0; i < classe.tamanho(); i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            if (classe.busca(i).equals(nome)) {
                System.out.println("Posição: " +  classe.busca(i));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }
    }
}