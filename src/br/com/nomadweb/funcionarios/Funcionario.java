package br.com.nomadweb.funcionarios;

public class Funcionario {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calculaImposto() {
        return this.salario * 0.01;
    }
}
