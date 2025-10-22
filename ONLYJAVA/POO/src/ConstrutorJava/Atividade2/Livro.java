package ConstrutorJava.Atividade2;

public class Livro {
    private String titulo;
    private String autor;
    private long ISBN;
    private int numeroDePaginas;
    private double valorDeCompra;

    public Livro(String titulo, String autor, Long ISBN, int numeroDePaginas, double valorDeCompra) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroDePaginas = numeroDePaginas;
        this.valorDeCompra = valorDeCompra;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN=" + ISBN +
                ", numeroDePaginas=" + numeroDePaginas +
                ", valorDeCompra=" + valorDeCompra +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(double valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }
}
