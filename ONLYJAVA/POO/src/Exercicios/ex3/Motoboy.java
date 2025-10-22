package Exercicios.ex3;

public class Motoboy extends Funcionario{
    private String placadamoto;

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    public String getPlacadamoto() {
        return placadamoto;
    }

    public void setPlacadamoto(String placadamoto) {
        this.placadamoto = placadamoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placadamoto='" + placadamoto + '\'' +
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
