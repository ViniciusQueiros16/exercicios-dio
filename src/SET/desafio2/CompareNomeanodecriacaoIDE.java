package SET.desafio2;

import java.util.Comparator;

public class CompareNomeanodecriacaoIDE implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());

        if (nome != 0 ) return nome;
        if (anoDeCriacao != 0 ) return anoDeCriacao;
        return l1.getIde().compareToIgnoreCase(l2.getIde());


    }
}
