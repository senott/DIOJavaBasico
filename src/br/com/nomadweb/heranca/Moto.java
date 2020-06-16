package br.com.nomadweb.heranca;

public class Moto extends Veiculo {
    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public Double calculaImposto() {
        return this.getValorVenal() * 0.03;
    }
}
