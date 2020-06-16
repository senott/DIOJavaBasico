package br.com.nomadweb.datas;

import java.time.LocalDateTime;

public class DataHoraLocal {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);

        //Exercício
        LocalDateTime tempo = LocalDateTime.of(2010, 5, 15, 10, 0, 0);

        System.out.println(tempo);

        tempo = tempo.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(tempo);

    }
}
