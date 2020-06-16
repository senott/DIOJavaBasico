package br.com.nomadweb.colecoes;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Ciclismo");
        esportes.add("Surfe");
        esportes.add("Tênis de Mesa");

        // Altera valor da posição 3
        esportes.set(3, "Ping Pong");

        System.out.println(esportes);

        for (String esporte: esportes) {
            System.out.println(esporte);
        }

        // Remove item pelo índice
        esportes.remove(1);
        System.out.println(esportes);

        // Remove item pelo nome
        esportes.remove("Ping Pong");
        System.out.println(esportes);

    }
}
