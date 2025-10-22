package Herenca.atividade1;

public class Memoria extends Componente {
    private String capacidadeDeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadeDeArmazenamento) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadeDeArmazenamento='" + capacidadeDeArmazenamento + '\'' +
                '}';
    }

    @Override
    public void exibirDados(){
        System.out.println("Atributos de Mémoria: ");
        super.exibirDados();
        System.out.println(this.capacidadeDeArmazenamento);
        System.out.println("-----------------------");
    }
}
