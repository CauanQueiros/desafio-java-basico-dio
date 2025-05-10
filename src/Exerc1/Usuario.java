package Exerc1;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String id;
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public boolean emprestarLivro(Livro livro){
        if (livro.isDisponivel()) {
            livrosEmprestados.add(livro);
            livro.setDisponivel(false);
            return true;
        }
        return false;
    }

    public boolean devolverLivro(Livro livro){
        if (livrosEmprestados.remove(livro)) {
            livro.setDisponivel(true);
            return true;
        }
        return false;
    }

    public void listarLivros () {
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            System.out.println("Livros emprestados por " + nome + ":");
            for (Livro livro : livrosEmprestados) {
                System.out.println(livro);
            }
        }
    }


    public String getNome () {
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getId () {
        return id;
    }

    public void setId (String id){
        this.id = id;
    }
}

