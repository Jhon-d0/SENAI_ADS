package ConstrutorJava.Atividade3;

public class Cliente {
    private String nome;
    private int idade;
    private endereco endereco;


    public Cliente(String nome, int idade, ConstrutorJava.Atividade3.endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ConstrutorJava.Atividade3.endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(ConstrutorJava.Atividade3.endereco endereco) {
        this.endereco = endereco;
    }
}
