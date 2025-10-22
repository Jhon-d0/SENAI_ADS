package Exercicios.ex2;

import Exercicios.ex1.Funcionario;

public class Gerente extends CargoDeConfianca implements Contratacao{

    public Gerente(String nome, String cpf, String dataDeNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salarioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double obterSalarioFinal() {
        return 0;
    }
}
