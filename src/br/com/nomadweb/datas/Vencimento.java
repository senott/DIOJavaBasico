package br.com.nomadweb.datas;

import java.util.Calendar;

public class Vencimento {

    public static void main(String[] args) {
        var prazo = 10;

        //dataAtual
        //diasPagamento

        Calendar dataVencimento = Calendar.getInstance();

        System.out.println("Data vencimento: " + dataVencimento.getTime());

        dataVencimento.add(Calendar.DATE, prazo);

        if (dataVencimento.DAY_OF_WEEK == Calendar.SATURDAY) {
            dataVencimento.add(Calendar.DATE, 2);
        } else if (dataVencimento.DAY_OF_WEEK == Calendar.SUNDAY) {
            dataVencimento.add(Calendar.DATE, 1);
        }

        System.out.println("O prazo máximo para pagamento é: " + dataVencimento.getTime());

    }
}
