package br.com.nomadweb.colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        // Remove nota do Set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        // navega em todos os itens
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println("While: " + iterator.next());
        }

        for (Double nota : notasAlunos) {
            System.out.println("For: " + nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }
}
