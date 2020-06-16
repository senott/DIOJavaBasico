package br.com.nomadweb.colecoes;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        // Remove o número do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        // Retorna o tamanho do set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println("->" + iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("-->" + numero);
        }

        // Retorna se o set está vazio
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
