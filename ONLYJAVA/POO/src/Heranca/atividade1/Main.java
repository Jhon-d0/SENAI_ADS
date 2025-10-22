package Herenca.atividade1;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Intel", "Core i7-11700K", "3.6GHz");
        Memoria memoria = new Memoria("Corsair", "DDR4", "16GB");
        PlacaMae placaMae = new PlacaMae("ASUS", "ROG STRIX B550-F", "AM4");
        DispositivosDeArmazenamento dispositivosDeArmazenamento = new DispositivosDeArmazenamento(
                "Samsung",            // marca
                "SSD",                // tipo
                "1TB",                // capacidade
                "NVMe M.2"            // interface
        );

        dispositivosDeArmazenamento.exibirDados();
        placaMae.exibirDados();
        processador.exibirDados();
        memoria.exibirDados();
    }
}
