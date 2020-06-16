package br.com.nomadweb.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatarDataSimples {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

        SimpleDateFormat formatterHour = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SS");

        String dataComHora = formatterHour.format(agora);

        System.out.println(dataComHora);
    }
}
