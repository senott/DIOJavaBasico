package br.com.nomadweb.comparators;

public class Carro implements Comparable<Carro> {

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getCavalos() {
        return cavalos;
    }

    private final String marca;
    private final String modelo;
    private final Integer cavalos;

    public Carro(String marca, String modelo, Integer cavalos) {
        this.marca = marca;
        this.modelo = modelo;
        this.cavalos = cavalos;
    }

    @Override
    public int compareTo(Carro o) {
        return this.getCavalos() - o.getCavalos();
    }

    @Override
    public String toString() {
        return marca + " " + modelo + "(" + cavalos + ")";
    }
}
