package GenericTypes.Exerc2;

public class Main {
    public static void main(String[] args) {
        Estoque<String> estoque = new Estoque<>();

        estoque.adicionarItens("Barra de chocolate");
        estoque.adicionarItens("Salgadinho");
        estoque.adicionarItens("Refrigerante\n");

        estoque.listarItens();

        estoque.removerItens("Salgadinho");

        estoque.listarItens();
    }
}
