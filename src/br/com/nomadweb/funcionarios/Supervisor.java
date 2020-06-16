package br.com.nomadweb.funcionarios;

public class Supervisor extends Funcionario {

    @Override
    public Double calculaImposto() {
        return this.getSalario() * 0.05;
    }

}
