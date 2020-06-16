package br.com.nomadweb.funcionarios;

public class Gerente extends Funcionario {

    @Override
    public Double calculaImposto() {
        return this.getSalario() * 0.1;
    }
}
