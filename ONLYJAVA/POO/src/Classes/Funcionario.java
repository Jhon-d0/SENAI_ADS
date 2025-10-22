package Classes;

public class Funcionario {
    private String codigoDoFuncionario;
    private String nome;
    private String endereco;
    private long telefone;
    private String email;
    private ContaBancaria contaBancaria;

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigoDoFuncionario='" + codigoDoFuncionario + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", contaBancaria=" + contaBancaria +
                '}';
    }

    public Funcionario(String codigoDoFuncionario, String nome, String endereco, long telefone, String email, ContaBancaria contaBancaria) {
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
    }

    public String getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(String codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}
