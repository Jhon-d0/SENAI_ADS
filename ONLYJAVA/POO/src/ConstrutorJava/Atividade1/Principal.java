package ConstrutorJava.Atividade1;

public class Principal {
    public static void main(String[] args) {
        pet c1 = new pet("Ralph", 4, "Dorberman", "grande", "ração");
        pet c2 = new pet("Arthur", 2, "Pincher", "pequeno", "ração");


        System.out.println("O nome do meu cachorro é: " + c1.getNome());
        System.out.println("A idade do meu " + c1.getNome() + " é: " + c1.getIdade());
        System.out.println("A Raça do meu " + c1.getNome() + " é: " + c1.getRaca());
        System.out.println("O meu " + c1.getNome() + " é de porte " + c1.getPorte());
        System.out.println("O meu " + c1.getNome() + " come apenas " + c1.getAlimentacao());

        System.out.println(c2);
    }
}
