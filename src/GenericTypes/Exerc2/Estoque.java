package GenericTypes.Exerc2;

import java.util.ArrayList;
import java.util.List;

public class Estoque <T>{
    List<T> listaDeCoisas = new ArrayList<>();

    public void adicionarItens (T item){
        listaDeCoisas.add(item);
    }

    public void removerItens (T item){
        if (listaDeCoisas.isEmpty()){
            System.out.println("Lista vazia. ");
        } else if (listaDeCoisas.contains(item)){
            listaDeCoisas.remove(item);
            System.out.println("Item removido da lista. ");
        } else {
            System.out.println("Item não encontrado. ");
        }
    }

    public void listarItens (){
        if (listaDeCoisas.isEmpty()){
            System.out.println("Lista vazia. ");
        } else {
            System.out.println("\nItens no estoque:");
            for (T itens : listaDeCoisas){
                System.out.println(itens);
            }
        }
    }
}
