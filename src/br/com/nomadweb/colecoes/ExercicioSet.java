package br.com.nomadweb.colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet {

    public static void main(String[] args) {

        // Set
        System.out.println("--> Set");

        Set<Integer> numerosSet = new HashSet<>();

        numerosSet.add(3);
        numerosSet.add(88);
        numerosSet.add(20);
        numerosSet.add(44);
        numerosSet.add(3);

        numerosSet.add(null);

        System.out.println(numerosSet);

        for (Integer numero: numerosSet) {
            System.out.println(numero);
        }

        // Remove o primeiro elemento
        System.out.println(numerosSet.remove(3));

        numerosSet.add(23);

        System.out.println(numerosSet.size());

        System.out.println(numerosSet.isEmpty());

        // LinkedHashSet
        System.out.println("--> LinkedHashSet");

        LinkedHashSet<Integer> numerosHashSet = new LinkedHashSet<>();

        numerosHashSet.add(3);
        numerosHashSet.add(88);
        numerosHashSet.add(20);
        numerosHashSet.add(44);
        numerosHashSet.add(3);

        System.out.println(numerosHashSet);

        for (Integer numero: numerosHashSet) {
            System.out.println(numero);
        }

        System.out.println(numerosHashSet.remove(3));

        numerosHashSet.add(23);

        System.out.println(numerosHashSet.size());

        System.out.println(numerosHashSet.isEmpty());

        // Tree
        System.out.println("-> Tree");

        TreeSet<Integer> numerosTree = new TreeSet<>();

        numerosTree.add(3);
        numerosTree.add(88);
        numerosTree.add(20);
        numerosTree.add(44);
        numerosTree.add(3);

        System.out.println(numerosTree);

        for (Integer numero: numerosTree) {
            System.out.println(numero);
        }

        numerosTree.pollFirst();

        numerosTree.add(23);

        System.out.println(numerosTree);

        System.out.println(numerosTree.size());

        System.out.println(numerosTree.isEmpty());

    }
}
