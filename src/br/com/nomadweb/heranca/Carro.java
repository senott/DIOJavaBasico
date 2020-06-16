package br.com.nomadweb.heranca;

public class Carro extends Veiculo {
    private int numeroPortas;

// --Commented out by Inspection START (09/06/20 19:54):
//    public int getNumeroPortas() {
//        return numeroPortas;
//    }
// --Commented out by Inspection STOP (09/06/20 19:54)

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public Double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}
