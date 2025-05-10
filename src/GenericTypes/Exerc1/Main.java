package GenericTypes.Exerc1;

public class Main {
    public static void main(String[] args) {
        Caixa<String>caixaDeTexto = new Caixa<>();
        Caixa<Integer>caixaDeNumero = new Caixa<>();

        caixaDeTexto.guardar("Ola mundo !!");
        caixaDeNumero.guardar(42);

        System.out.println("Caixa de texto contém: " + caixaDeTexto.pegar());
        System.out.println("Caixa de número contém: " + caixaDeNumero.pegar());




    }
}
