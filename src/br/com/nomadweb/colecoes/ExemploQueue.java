package br.com.nomadweb.colecoes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // Retorna o primeiro elemento e remove da fila
        String proximoCliente = filaBanco.poll();

        System.out.println(proximoCliente);

        System.out.println(filaBanco);

        // Retorna o primeiro elemento e NÃO remova da fila
        String primeiroCliente = filaBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaBanco);

        // Lista os elementos da fila
        for (String cliente: filaBanco) {
            System.out.println(cliente);
        }

        Iterator<String> iteratorFila = filaBanco.iterator();

        while (iteratorFila.hasNext()) {
            System.out.println("->" + iteratorFila.next());
        }

        // Retorna o tamanho da fila
        System.out.println(filaBanco.size());

        // retorna se a fila está vazia
        System.out.println(filaBanco.isEmpty());

        // Retorna o primeiro elemento ou erro se a lista estiver vazia
        filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaBanco);
    }
}
