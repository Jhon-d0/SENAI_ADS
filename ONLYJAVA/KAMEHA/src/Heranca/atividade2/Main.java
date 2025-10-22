package Herenca.atividade2;

import Heranca.atividade2.Fisica;
import Heranca.atividade2.Juridica;
import Heranca.atividade2.Pessoa;

public class Main {
    public static void main(String[] args) {

        Fisica f1 = new Fisica("Fernando", "71 995435345", "9234523942", "32435254234", "10/01/2006");
        Juridica j1 = new Juridica("Luis", "71 99534242", "1234124", "32423424");

        System.out.println(f1);
        System.out.println(j1);


    }
}
