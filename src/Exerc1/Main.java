package Exerc1;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", 1949, true);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 1899, true);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, true);

        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("\n========== LISTA INICIAL ==========");
        biblioteca.listarLivrosDisponiveis();

        // Criando usuário
        Usuario usuario = new Usuario("João", "U001");

        // João tenta pegar o livro "1984"
        System.out.println("\n========== EMPRÉSTIMO ==========");
        boolean emprestado = usuario.emprestarLivro(livro1);
        System.out.println(emprestado ? "Livro emprestado com sucesso!" : "Livro não disponível para empréstimo.");

        // João tenta pegar o mesmo livro de novo
        boolean emprestado2 = usuario.emprestarLivro(livro1);
        System.out.println(emprestado2 ? "Livro emprestado com sucesso!" : "Livro não disponível para empréstimo.");

        // Listando livros emprestados
        System.out.println("\n========== LIVROS EMPRESTADOS ==========");
        usuario.listarLivros();

        // Livros disponíveis após o empréstimo
        System.out.println("\n========== DISPONÍVEIS NA BIBLIOTECA ==========");
        biblioteca.listarLivrosDisponiveis();

        // João devolve o livro
        System.out.println("\n========== DEVOLUÇÃO ==========");
        boolean devolvido = usuario.devolverLivro(livro1);
        System.out.println(devolvido ? "Livro devolvido com sucesso!" : "Livro não estava emprestado.");

        // Buscar livros
        System.out.println("\n========== BUSCA ==========");
        biblioteca.buscarLivroPorTitulo("Dom Casmurro");
        biblioteca.buscarLivroPorTitulo("Harry Potter");
    }
}

