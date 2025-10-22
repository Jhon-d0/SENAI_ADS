package Herenca.atividade1;

public class Processador  extends Componente {
    private String frequencia;

    public Processador(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequencia='" + frequencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void exibirDados(){
        System.out.println("Atributos de Processador");
        super.exibirDados();
        System.out.println(this.frequencia);
        System.out.println("------------------------------");
    }
}
