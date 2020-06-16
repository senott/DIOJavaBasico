package br.com.nomadweb.maps;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        Map<String, Integer> campeosMundo = new HashMap<>();

        campeosMundo.put("Brasil", 5);
        campeosMundo.put("Alemanha", 4);
        campeosMundo.put("Itália", 4);
        campeosMundo.put("Uruguai", 2);
        campeosMundo.put("Argentina", 2);
        campeosMundo.put("França", 2);
        campeosMundo.put("Inglaterra", 1);
        campeosMundo.put("Espanha", 1);

        System.out.println(campeosMundo);

        // Atualiza valor para a chave Brasil
        campeosMundo.put("Brasil", 6);

        System.out.println(campeosMundo);

        // Retorna a Argentina
        System.out.println(campeosMundo.get("Argentina"));

        // Retorna se existe um campeão França
        System.out.println(campeosMundo.containsKey("França"));

        // Remove o campeão França
        campeosMundo.remove("França");

        // Retorna se existe um campeão França
        System.out.println(campeosMundo.containsKey("França"));

        // Retorna se existe alguma seleção haxacampeã
        System.out.println(campeosMundo.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(campeosMundo.size());

        // Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: campeosMundo.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        for (String key : campeosMundo.keySet()) {
            System.out.println(key + "==" + campeosMundo.get(key));
        }

        // Limpa o mapa
        campeosMundo.clear();

        // Retorna o tamanho do mapa
        System.out.println(campeosMundo.size());

    }
}
