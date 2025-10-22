package Heranca.atividade3;

public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico("Fernando", "fernandofg43@gmail.com", 3135, new Endereco("Rua Pirim carvalho", "719 94933423", "1 andar", "3212", "Salvador"), "adwdawd");
        Engenheiro e1 = new Engenheiro("Luis", "luisfabricios34@gmail.com", 5000, new Endereco("Rua maicon audim", "71 995435", "2 andar", "2131", "Salvador"), "213213");

        m1.imprimiMedico();
        e1.imprimiEngenheiro();


    }
}
