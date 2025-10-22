package Exercicios.ex3;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double salarioBase;
    protected String dataDeNascimento;
    protected String dataDeAdmissao;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }
}
