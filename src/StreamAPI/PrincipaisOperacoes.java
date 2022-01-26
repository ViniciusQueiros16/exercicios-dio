package StreamAPI;

import java.util.*;
import java.util.function.Function;

public class PrincipaisOperacoes {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new LinkedHashMap<>(){{
            put(1, new Contato("Tony",5555));
            put(3, new Contato("Vinny",1111));
            put(2, new Contato("Samy",2222));
        }};
        System.out.println("Ordem de inserção");
        for (Map.Entry<Integer, Contato> entry:agenda.entrySet()) {
            System.out.println(entry.getKey()+ "-" +entry.getValue().getNumero() +
                    ": "+entry.getValue().getNome());
        }
        System.out.println("Ordem de ID");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        for (Map.Entry<Integer, Contato> entry:agenda2.entrySet()) {
            System.out.println(entry.getKey()+ "-" +entry.getValue().getNumero() +
                    ": "+entry.getValue().getNome());
        }
/*//        Comparator com Classe Anonima
        System.out.println("Ordem de Telefone com Classe Anonima");
        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> num1, Map.Entry<Integer, Contato> num2) {
                return Integer.compare(num1.getValue().getNumero(), num2.getValue().getNumero());
            }
        });
        agenda3.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry:agenda3) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNumero() +
                    ": "+ entry.getValue().getNome());
        }
//      Com Function Interface
        System.out.println("Ordem de Telefone com function");
        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));
        agenda4.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry:agenda4) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNumero() +
                    ": "+ entry.getValue().getNome());
        }*/
//      Simplificando mais ainda com o LAMBDA

        System.out.println("Ordem de Telefone com Lambda");
        Set<Map.Entry<Integer, Contato>> agenda5= new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        agenda5.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry:agenda5) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNumero() +
                    ": "+ entry.getValue().getNome());
        }
/*//        Organizando pelo nome do contato com Classe Anonima
        System.out.println("Ordem do nome de contato com Classe Anonima");
        Set<Map.Entry<Integer, Contato>> agendanome = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> num1, Map.Entry<Integer, Contato> num2) {
                return num1.getValue().getNome().compareToIgnoreCase(num2.getValue().getNome());
            }
        });
        agendanome.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry:agendanome) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNumero() +
                    ": "+ entry.getValue().getNome());
        }

        //        Organizando pelo nome do contato com Function Interface
        System.out.println("Ordem do nome de contato com Function Interface");
        Set<Map.Entry<Integer, Contato>> agendanome1 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, String>() {
            @Override
            public String apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNome();
            }
        }));
        agendanome1.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry:agendanome1) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNumero() +
                    ": "+ entry.getValue().getNome());
        }*/
        //        Organizando pelo nome do contato com Lambda
        System.out.println("Ordem do nome de contato com o LAMBDA");
        Set<Map.Entry<Integer, Contato>> agendanome2 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));

        agendanome2.addAll(agenda2.entrySet());
        for (Map.Entry<Integer, Contato> entry:agendanome2) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNumero() +
                    ": "+ entry.getValue().getNome());
        }



    }
}
