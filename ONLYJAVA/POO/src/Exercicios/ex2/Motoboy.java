package Exercicios.ex2;

public class Motoboy extends Funcionario{
    private String  placaDaMoto;

    public Motoboy(String nome, String cpf, String dataDeNascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataDeNascimento, salarioBase);
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return 0;
    }
}
