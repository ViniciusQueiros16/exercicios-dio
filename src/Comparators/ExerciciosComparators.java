package Comparators;

import StreamAPI.Contato;

import java.util.*;
import java.util.function.Function;

public class ExerciciosComparators {
    public static void main(String[] args) {
        List<familia> pessoas = new ArrayList<>();

        pessoas.add(new familia("Tony",44));
        pessoas.add(new familia("Vinny",20));
        pessoas.add(new familia("Samy",14));
        pessoas.add(new familia("Luciana",43));

        System.out.println("Ordem de inserção");
        System.out.println(pessoas);

        System.out.println("Ordem de idade");
        pessoas.sort(Comparator.comparing(familia -> familia.getIdade()));

        System.out.println(pessoas);

        System.out.println("Ordem inversa de idade");
        Collections.sort(pessoas, new FamiliaOrdemDeIdadeInversa());
        System.out.println(pessoas);



    }
}
