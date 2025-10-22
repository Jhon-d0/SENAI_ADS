package ConstrutorJava.Atividade2;

public class Veiculo {
    private String Placa;
    private String Cor;
    private int numeroDePassageiros;
    private double capacidadeDeTank;
    private int velocidadeMaxima;
    private int consumoMedio;


    public Veiculo(String placa, String cor, int numeroDePassageiros, double capacidadeDeTank, int velocidadeMaxima, int consumoMedio) {
        Placa = placa;
        Cor = cor;
        this.numeroDePassageiros = numeroDePassageiros;
        this.capacidadeDeTank = capacidadeDeTank;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumoMedio = consumoMedio;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    public double getCapacidadeDeTank() {
        return capacidadeDeTank;
    }

    public void setCapacidadeDeTank(double capacidadeDeTank) {
        this.capacidadeDeTank = capacidadeDeTank;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(int consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "Placa=" + Placa +
                ", Cor='" + Cor + '\'' +
                ", numeroDePassageiros=" + numeroDePassageiros +
                ", capacidadeDeTank=" + capacidadeDeTank +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", consumoMedio=" + consumoMedio +
                '}';
    }
}
