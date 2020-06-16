package br.com.nomadweb.colecoes;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTree {

    public static void main(String[] args) {

        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);

        // Retorna o primeiro elemento da árvore
        System.out.println(capitais.first());

        // Retorna o último elemento da árvore
        System.out.println(capitais.last());

        // Retorna o elemento abaixo do utilizado como parâmetro
        System.out.println(capitais.lower("Florianópolis"));

        // Retorna o elemento acima do utilizado como parâmetro
        System.out.println(capitais.higher("Florianópolis"));

        // Retorna o primeiro elemento da árvore, removendo-o
        System.out.println(capitais.pollFirst());

        // Retorna o último elemento da árvore, removendo-o
        System.out.println(capitais.pollLast());

        System.out.println(capitais);

        // Navega nos elementos da árvore
        Iterator<String> iterator = capitais.iterator();

        while (iterator.hasNext()) {
            System.out.println("->" + iterator.next());
        }

        for (String capital: capitais) {
            System.out.println("-->" + capital);
        }
    }
}
