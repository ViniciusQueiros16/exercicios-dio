package Listas;

import java.util.LinkedList;

public class CriarLista {
    public static void main(String[] args) {
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(6.0);
        notas2.add(8.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);

        System.out.println(notas2.remove(0));
        System.out.println(notas2);

    }
}
