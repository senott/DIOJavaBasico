package br.com.nomadweb.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> catrafa = new LinkedList<>();

        catrafa.add("Juliana");
        catrafa.add("Pedro");
        catrafa.add("Carlos");
        catrafa.add("Larissa");
        catrafa.add("João");

        for (String elemento: catrafa) {
            System.out.println(elemento);
        }

        String primeiro = catrafa.peek();

        System.out.println(primeiro);

        System.out.println(catrafa);

        String primeiroAtendido = catrafa.poll();

        System.out.println(primeiroAtendido);

        System.out.println(catrafa);

        catrafa.add("Daniel");

        System.out.println(catrafa);

        System.out.println(catrafa.size());

        System.out.println(catrafa.isEmpty());

        System.out.println(catrafa.contains("Carlos"));

    }
}
