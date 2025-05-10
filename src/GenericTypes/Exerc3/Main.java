package GenericTypes.Exerc3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto("Café", 15.0, 10));
        lista.add(new Produto("Arroz", 20.0, 5));
        lista.add(new Produto("Banana", 5.0, 30));

        System.out.println("Original:");
        lista.forEach(System.out::println);

        Collections.sort(lista);
        System.out.println("Ordenado por nome:");
        lista.forEach(System.out::println);

        Collections.sort(lista, Produto.porPreco);
        System.out.println("Ordenado por preço:");
        lista.forEach(System.out::println);
    }
}