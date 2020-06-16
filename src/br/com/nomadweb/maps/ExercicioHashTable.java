package br.com.nomadweb.maps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class ExercicioHashTable {

    public static void main(String[] args) {

        Hashtable<String, String> estados = new Hashtable<>();

        estados.put("RS", "Rio Grande do Sul");
        estados.put("SC", "Santa Catarina");
        estados.put("PR", "Paraná");
        estados.put("SP", "São Paulo");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("ES", "Espírito Santo");
        estados.put("MG", "Minas Gerais");
        estados.put("GO", "Goiás");
        estados.put("MT", "Mato Grosso");
        estados.put("RO", "Rondônia");
        estados.put("AC", "Acre");
        estados.put("AM", "Amazonas");
        estados.put("RR", "Roraima");
        estados.put("AP", "Amapá");
        estados.put("PA", "Pará");
        estados.put("MA", "Maranhão");
        estados.put("TO", "Tocantins");
        estados.put("PI", "Piauí");
        estados.put("CE", "Ceará");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("PB", "Paraíba");
        estados.put("PE", "Pernambuco");
        estados.put("AL", "Alagoas");
        estados.put("SE", "Sergipe");
        estados.put("BA", "Bahia");

        System.out.println(estados);

        // retorna o tamanho do mapa
        System.out.println(estados.size());

        // Remove MG
        estados.remove("MG");

        // Adiciona o DF
        estados.put("DF", "Distrito Federal");

        // Remove MS usando o nome
        String removeKey = "";
        for (String key : estados.keySet()) {
            if (estados.get(key).equals("Mato Grosso do Sul")) {
                removeKey = key;
            }
        }
        if (!removeKey.isEmpty()){
            estados.remove(removeKey);
        }

        System.out.println(estados);

        // Navega nos elementos
        for (Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getValue() + " (" + entry.getKey() + ")");
        }
        
        // Verifica se existe SC
        System.out.println("SC? " + estados.containsKey("SC"));

        // Verifica se existe Maranhão
        System.out.println("Maranhão? " + estados.containsValue("Maranhão"));
    }

}

