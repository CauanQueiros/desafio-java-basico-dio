package Exerc1;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoDePublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = disponivel;
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

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void livroDisponivel() {
        if (!disponivel) {
            System.out.println("Livro não disponivel !");
        } else {
            System.out.println("Livro Disponivel !");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor +
                ", Ano: " + anoDePublicacao + ", Disponível: " + (disponivel ? "Sim" : "Não");
    }

}
