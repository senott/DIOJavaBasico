package br.com.nomadweb.funcionarios;

public class Atendente extends Funcionario {

    @Override
    public Double calculaImposto() {
        return this.getSalario() * 0.01;
    }

}
