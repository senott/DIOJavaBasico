package br.com.nomadweb.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioFinal {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Chevrolet", "S10", 112));
        carros.add(new Carro("Fiat", "Uno", 58));
        carros.add(new Carro("Ferrari", "F40", 240));
        carros.add(new Carro("Volkswagen", "Polo", 80));

        System.out.println(carros);

        // Ordenação utilizando interface Comparator
        carros.sort(Comparator.comparingInt(Carro::getCavalos));
        System.out.println("Ordenação interface Comparator:");
        System.out.println(carros);

        // Ordenação reversa utilizando interface Comparator
        carros.sort(Comparator.comparingInt(Carro::getCavalos).reversed());
        System.out.println("Ordenação reversa interface Comparator:");
        System.out.println(carros);

        // Ordenação utilizando interface Comparable
        Collections.sort(carros);
        System.out.println("Ordenação interface Comparable:");
        System.out.println(carros);

        // Ordenação reversa utilizando expressão lambda
        carros.sort((first, second) -> second.getCavalos() - first.getCavalos());
        System.out.println("Ordenação reversa expressão lambda:");
        System.out.println(carros);

    }
}
