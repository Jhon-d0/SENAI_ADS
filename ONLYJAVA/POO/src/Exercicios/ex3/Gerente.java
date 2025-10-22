package Exercicios.ex3;

public class Gerente extends CargoDeConfianca{

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }

    public Gerente(Bonificacao bonificacao) {
        super(bonificacao);
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}
