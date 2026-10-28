package estrutura_de_dados.lista_encadeada.boletim_notas;

import estrutura_de_dados.mapa.ListaEncadeada;

public class BoletimNotas {
    public static void main(String[] args) {
        ListaEncadeada<Boletim> boletims = new ListaEncadeada<>();

        //adicionar 5 disciplinas;
        boletims.adiciona(new Boletim("Matemática", 10));
        boletims.adiciona(new Boletim("Português", 9));
        boletims.adiciona(new Boletim("História", 8));
        boletims.adiciona(new Boletim("Geografia", 7));
        Boletim ciencia = new Boletim("Ciências", 9);
        boletims.adiciona(ciencia);

        //exibir todas as disciplinas com suas notas;
        System.out.println(boletims);

        //mostrar qual disciplina está em uma posição específica;
        System.out.println(boletims.buscaPorPosicao(2));

        //remover a disciplina de uma posição informada;
        System.out.println(boletims.remove(1));

        //verificar se uma disciplina está cadastrada;
        int num = boletims.busca(ciencia);
        if (num != -1) {
            System.out.println("Boletim encontrado");
        }else {
            System.out.println("Não encontrado");
        }
        //mostrar quantos registros existem após a remoção.
        System.out.println(boletims.getTamanho());
    }
}
