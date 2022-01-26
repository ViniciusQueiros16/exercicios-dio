package Comparators;

import java.util.Comparator;

public class FamiliaOrdemDeIdadeInversa implements Comparator<familia>{

    @Override
    public int compare(familia o1, familia o2) {
        return o2.getIdade() - o1.getIdade();
    }
}
