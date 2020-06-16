package br.com.nomadweb.datas;

import java.util.Calendar;

public class Add {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());

        agora.add(Calendar.DATE,-15);
        System.out.println("15 dias atrás: " + agora.getTime());

        agora.add(Calendar.MONTH,4);
        System.out.println("4 meses depois: " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());

    }
}
