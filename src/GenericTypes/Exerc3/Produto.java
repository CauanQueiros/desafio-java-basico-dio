package GenericTypes.Exerc3;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return this.nome.compareToIgnoreCase(outroProduto.nome);
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " - Estoque: " + estoque;
    }

    public static Comparator<Produto> porPreco = new Comparator<Produto>() {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    };
}