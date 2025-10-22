package Exercicios.ex1;

public class Diretor extends Funcionario implements Contratacao{
    private double premio = 0.2;


    public Diretor(String nome, String dataDeNascimento, Sexo sexo, Setor setor, double salarioBase, double premio) {
        super(nome, dataDeNascimento, sexo, setor, salarioBase);
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                '}';
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }
}
