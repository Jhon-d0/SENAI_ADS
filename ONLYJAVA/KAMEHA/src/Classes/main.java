package Classes;

public class main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Maria Joaquim", 50, "Salvador");

        Cliente c1 = new Cliente("Arthu", 19, endereco);

        ContaBancaria contaDoBanco = new ContaBancaria(3213, 3254, 23424, "Corrente", 1500, 5000);

        Funcionario funcionario1 = new Funcionario("da3d34", "Alberto", "R. pirim", 992395242, "alverdoagvea@gmail.com", contaDoBanco);


        System.out.printf("Meu nome é " + c1.getNome() + " Tenho " + c1.getIdade() + " Anos e moro em " + endereco.getCidade() + " Na rua " + endereco.getLogradouro() + " no número " + endereco.getNumero());

        System.out.println("---------------------------------------");

        System.out.println(funcionario1 + "\n"+ contaDoBanco);

    }
}