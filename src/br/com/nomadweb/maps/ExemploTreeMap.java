package br.com.nomadweb.maps;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> capitais = new TreeMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Florianópolis");
        capitais.put("PR", "Curitiba");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        capitais.put("MG", "Belo Horizonte");

        System.out.println(capitais);

        // Retorna a capital no topo da árvore
        System.out.println(capitais.firstKey());

        // Retorna a capital na última posição
        System.out.println(capitais.lastKey());

        // Retorna a capital abaixo da utilizada como parâmetro
        System.out.println("Lower: " + capitais.lowerKey("SC"));

        // Retorna a capital acima da utilizada como parâmetro
        System.out.println("Higher: " + capitais.higherKey("SC"));

        System.out.println(capitais);

        // Retorna a capital no topo da árvore
        System.out.println("Topo: " + capitais.firstEntry().getKey() + " - " + capitais.firstEntry().getValue());

        // Retorna a capital no fim da árvore
        System.out.println("Fim: " + capitais.lastEntry().getKey() + " - " + capitais.lastEntry().getValue());

        // retorna a primeira capital abaixo da utilizada como parâmetro
        System.out.println("Abaixo: " + capitais.lowerEntry("SC").getKey() + " - " + capitais.lowerEntry("SC").getValue());

        // retorna a primeira capital acima da utilizada como parâmetro
        System.out.println("Acima: " + capitais.higherEntry("SC").getKey() + " - " + capitais.higherEntry("SC").getValue());

        // Retorna a capital no topo, removendo-a
        Map.Entry<String, String> firstEntry = capitais.pollFirstEntry();
        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

        // Retorna a capital no fim, removendo-a
        Map.Entry<String, String> lastEntry = capitais.pollLastEntry();
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        System.out.println(capitais);

        // Navegar entre os elementos
        Iterator<String> iterator = capitais.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + capitais.get(key));
        }

        for (String capital: capitais.keySet()) {
            System.out.println(capital + " -- " + capitais.get(capital));
        }

        for (Map.Entry<String, String> capital: capitais.entrySet()) {
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }
    }
}
