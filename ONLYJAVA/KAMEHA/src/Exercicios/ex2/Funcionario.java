package Exercicios.ex2;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String dataDeNascimento;
    protected double salarioBase;


    public Funcionario(String nome, String cpf, String dataDeNascimento, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
