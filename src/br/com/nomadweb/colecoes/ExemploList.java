package br.com.nomadweb.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        // Atualiza o elemento na posição 2
        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        // Atualiza o elemento na posição 2
        nomes.set(2, "Wesley");

        System.out.println(nomes);

        // Remove o elemento na posição 4
        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3);

        System.out.println(nome);

        // Retorna o tamanho da lista
        int tamanho = nomes.size();

        System.out.println(tamanho);

        // Retorna a posição de um elemento
        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao);

        // Verifica se a lista possui o elemento
        boolean temAnderson = nomes.contains("Anderson");
        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temAnderson);
        System.out.println(temFernando);

        // Verifica se a lista está vazia
        boolean vazia = nomes.isEmpty();
        System.out.println(vazia);

        // Iteração entre os items da lista
        for (String item: nomes) {
            System.out.println(item);
        }

        Iterator iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Limpa a lista
        nomes.clear();
        vazia = nomes.isEmpty();
        System.out.println(vazia);

    }
}
