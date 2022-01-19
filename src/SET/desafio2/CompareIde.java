package SET.desafio2;

import java.util.Comparator;

public class CompareIde implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}
