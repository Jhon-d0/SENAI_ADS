package Enum;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("123d233d", "Albert", 1244, Setor.VENDAS, Sexo.MASCULINO, 26);

        System.out.println(f1.toString());
    }
}
