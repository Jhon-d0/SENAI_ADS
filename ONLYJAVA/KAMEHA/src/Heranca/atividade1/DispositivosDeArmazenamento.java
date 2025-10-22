package Herenca.atividade1;

public class DispositivosDeArmazenamento extends Componente {
    private String capacidadeDeArmazenamento;
    private String tipoDeConexao;

    public DispositivosDeArmazenamento(String marca, String modelo, String capacidadeDeArmazenamento, String tipoDeConexao) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }

    @Override
    public String toString() {
        return "DispositivosDeArmazenamento{" +
                "capacidadeDeArmazenamento='" + capacidadeDeArmazenamento + '\'' +
                ", tipoDeConexao='" + tipoDeConexao + '\'' +
                '}';
    }

    @Override
    public void exibirDados(){
        System.out.println("Atributos de Dispositivos de Armazenamento: ");
        super.exibirDados();
        System.out.println(this.capacidadeDeArmazenamento);
        System.out.println(this.tipoDeConexao);
        System.out.println("-----------------------");
    }
}
