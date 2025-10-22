package Exercicios.ex3;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
