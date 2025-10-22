package Herenca.atividade1;

public class PlacaMae extends Componente {
    private String soquete;

    public PlacaMae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }

    @Override
    public String toString() {
        return "PlacaMae{" +
                "soquete='" + soquete + '\'' +
                '}';
    }

    @Override
    public void exibirDados() {
        System.out.println("Atributos de Placa Mãe: ");
        super.exibirDados();
        System.out.println(this.soquete);
        System.out.println("-----------------------");
    }
}
