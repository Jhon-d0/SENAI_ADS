package Classes;

public class ContaBancaria {
    private int banco;
    private int agencia;
    private int numeroDaConta;
    private String tipoDaConta;
    private double saldoAtual;
    private double limiteDisponivel;


    public ContaBancaria(int banco, int agencia, int numeroDaConta, String tipoDaConta, double saldoAtual, double limiteDisponivel) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.tipoDaConta = tipoDaConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "banco=" + banco +
                ", agencia=" + agencia +
                ", numeroDaConta=" + numeroDaConta +
                ", tipoDaConta='" + tipoDaConta + '\'' +
                ", saldoAtual=" + saldoAtual +
                ", limiteDisponivel=" + limiteDisponivel +
                '}';
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
