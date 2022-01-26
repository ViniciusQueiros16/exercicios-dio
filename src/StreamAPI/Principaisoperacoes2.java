package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Principaisoperacoes2 {
    public static void main(String[] args) {
        List<String> numAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        //        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numAleatorios.stream().forEach(System.out::println);
//        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
//        numAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
//        System.out.println("Transforme esta lista de String em uma lista de números inteiros.")
        /*List<Integer> list = numAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(list);*/
//        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        /*numAleatorios.stream()
                .map(Integer::parseInt)
                .filter(s -> (s%2==0 && s >2))
                .collect(Collectors.toList())
                .forEach(System.out::println);*/
//        System.out.println("Mostre a média dos números: ");
        /*numAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average().ifPresent(v -> System.out.println(v));
*/
//         System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
//        numAleatorios.stream().skip(3).forEach(System.out::println);
//        System.out.println("Retirando os números repetidos da lista");
//        numAleatorios.stream().distinct().forEach(System.out::println);
//        System.out.println("o maior valor da lista");
//        numAleatorios.stream().mapToInt(v -> Integer.parseInt(v)).max().ifPresent(System.out::println);
//        System.out.println("o menor valor da lista");
//        numAleatorios.stream().mapToInt(v -> Integer.parseInt(v)).min().ifPresent(System.out::println);

        List<Integer> list = numAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        /*var somaImpares = list.stream().filter(i -> (i % 2 != 0)).mapToInt(Integer::intValue).sum();
        System.out.println("Pegue apenas os números ímpares e some:"+somaImpares);
*/
//        System.out.println("Mostre a lista na ordem númerica: ");
//        list.stream().sorted().forEach(System.out::println);
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> multiplos = list.stream().collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(multiplos.get(Boolean.TRUE));

    }
}
