package Herenca.atividade1;

public abstract  class  Componente {
    protected String marca;
    protected String modelo;

    public void exibirDados(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
    }

    public Componente(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
