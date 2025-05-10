package Exerc1;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> listaDeLivros = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        listaDeLivros.add(livro);
        System.out.println("Livro adicionado à biblioteca: " + livro.getTitulo());
    }

    public void listarLivrosDisponiveis(){
        System.out.println("Livros disponíveis:");
        for (Livro livro : listaDeLivros){
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void buscarLivroPorTitulo(String titulo){
        boolean encontrado = false;
        for (Livro livro : listaDeLivros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + livro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado com o título: " + titulo);
        }
    }
}
