package Exercicios.ex1;

public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operadores");

    private final String Descricao;

    Setor(String descricao) {
        Descricao = descricao;
    }

    public String getDescricao() {
        return Descricao;
    }
}
