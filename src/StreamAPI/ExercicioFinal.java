package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExercicioFinal {
    public static void main(String[] args) {
        List<alunos> estudantes = new ArrayList<>();
        estudantes.add(new alunos("Marcelo",16));
        estudantes.add(new alunos("Joana",34));
        estudantes.add(new alunos("Lucas",23));
        estudantes.add(new alunos("Pedro",12));
        estudantes.add(new alunos("Maria",56));
        estudantes.add(new alunos("João",34));
        estudantes.add(new alunos("Antonio",18));
        estudantes.add(new alunos("Beatriz",25));

//        estudantes.stream().forEach(System.out::println);

        estudantes.forEach(alunos -> System.out.println("Nome:"+alunos.getNome()+" - Idade:"+alunos.getIdade()));

        System.out.println("Quantidade de estudantes; "+estudantes.stream().count());
        System.out.println("Maiores de idade");
        estudantes.stream().filter(a -> (a.getIdade() >= 18)).forEach(System.out::println);
        System.out.println("Tem letra R no nome");
        estudantes.stream().filter(a -> (a.getNome().toUpperCase().contains("R"))).forEach(System.out::println);
        System.out.println("Existe pelo menos um estudante que tem letra D no nome?");
        System.out.println(estudantes.stream().anyMatch(al->(al.getNome().toUpperCase().contains("D"))));
        System.out.println("Mais novo");
        System.out.println(estudantes.stream().min(Comparator.comparing(alunos::getIdade)));

        System.out.println("Mais velho ");
        System.out.println(estudantes.stream().max(Comparator.comparing(alunos::getIdade)));









    }
}
