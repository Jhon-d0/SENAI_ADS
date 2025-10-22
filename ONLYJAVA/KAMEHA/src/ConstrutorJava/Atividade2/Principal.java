package ConstrutorJava.Atividade2;

public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("ABC-1234", "Prata", 5, 50.0, 180, 18);
        Livro l1 = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 9780544003415L, 1216, 20.5);


        System.out.println(v1);
        System.out.println(l1);
    }
}
