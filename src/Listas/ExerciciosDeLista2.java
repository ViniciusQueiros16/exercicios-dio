package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciciosDeLista2 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome:nomes) System.out.println("-->"+nome);
        nomes.set(2,"Roberto");
        for (String nome:nomes) System.out.println("-->"+nome);
        System.out.println(nomes.get(1));
        nomes.remove(4);
        nomes.remove("João");
        for (String nome:nomes) System.out.println("-->"+nome);
        System.out.println(nomes.size());
        System.out.println(nomes.contains("Juliana"));

        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.println("Nova lista");
        System.out.println(novaLista);
        System.out.println("Juntar listas");
        nomes.addAll(novaLista);
        for (String nome:nomes) System.out.println("-->"+nome);
        System.out.println("Lista em ordem alfabetica");
        Collections.sort(nomes);
        for (String nome:nomes) System.out.println("-->"+nome);
        System.out.println("A lista esta vazia: "+nomes.isEmpty());



    }
}
