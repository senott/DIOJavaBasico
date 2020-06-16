package br.com.nomadweb.datas;

import java.time.LocalTime;

public class HoraLocal {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);

        LocalTime depois = agora.plusHours(1);

        System.out.println(depois);
    }
}
