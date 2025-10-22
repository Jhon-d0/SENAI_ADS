package Enum;

public class Funcionario {
    private String ID;
    private String nome;
    private double salario;
    private Setor setor;
    private Sexo sexo;
    private int idade;

    public Funcionario(String ID, String nome, double salario, Setor setor, Sexo sexo, int idade) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "ID='" + ID + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", setor=" + setor +
                ", sexo=" + sexo +
                ", idade=" + idade +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
