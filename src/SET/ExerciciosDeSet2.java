package SET;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExerciciosDeSet2 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);


        Iterator<Integer> interator = numeros.iterator();
        while (interator.hasNext()){
            System.out.println(interator.next());
        }

        System.out.println(numeros.size());
        System.out.println(numeros.isEmpty());
    }



}
