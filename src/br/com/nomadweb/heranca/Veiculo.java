package br.com.nomadweb.heranca;

public class Veiculo {
    private String modelo;
    private String marca;
    private Double valorVenal;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void acelera() {
        System.out.println("Acelerando...");
    }

    public Double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(Double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public Double calculaImposto() {
        return this.valorVenal * 0.01;
    }
}
