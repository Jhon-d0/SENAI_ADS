package Heranca.atividade3;

public abstract class Funcionario {
    protected String nome, email;
    protected double salario;
    protected Endereco endereco;

    public Funcionario(String nome, String email, double salario, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }


}
