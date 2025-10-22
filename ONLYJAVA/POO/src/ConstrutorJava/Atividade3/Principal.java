package ConstrutorJava.Atividade3;

public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Arthur", 18, new endereco("R. Pirim", 98, "Salvador"));

        System.out.println(c1.toString());
    }
}
