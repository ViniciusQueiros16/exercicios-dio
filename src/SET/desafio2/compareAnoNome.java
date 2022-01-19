package SET.desafio2;

import java.util.Comparator;

public class compareAnoNome implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0 ) return anoDeCriacao;
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}
