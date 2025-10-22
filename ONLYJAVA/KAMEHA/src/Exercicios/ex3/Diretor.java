package Exercicios.ex3;

public class Diretor extends CargoDeConfianca implements Contratacao{
    private double premio = 1.1;

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public Diretor(Bonificacao bonificacao, double premio) {
        super(bonificacao);
        this.premio = premio;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        
    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }
}
