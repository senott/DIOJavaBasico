package br.com.nomadweb.heranca;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto());

        Carro carro = new Carro();
        carro.setMarca("Nissan");
        carro.setModelo("March");
        carro.setNumeroPortas(4);
        carro.acelera();
        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto());

        Moto moto = new Moto();
        moto.setMarca("Ducati");
        moto.setModelo("Street Fighter");
        moto.setCilindradas("850");
        moto.acelera();
        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto());
    }
}
