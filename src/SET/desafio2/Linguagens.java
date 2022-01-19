package SET.desafio2;

import java.util.*;

/*Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:

Ordem de Inserção

Ordem Natural (nome)

IDE

Ano de criação e nome

Nome, ano de criacao e IDE

Ao final, exiba as linguagens no console, um abaixo da outra.*/

public class Linguagens {
    public static void main(String[] args) {
        Set<Linguagem> MinhasLinguagens = new LinkedHashSet<>() {{
            add(new Linguagem("JavaScript", 1995, "VisualStudioCode"));
            add(new Linguagem("Python", 1989, "Pycharm"));
            add(new Linguagem("Java", 1991, "Intellij"));
        }};


        System.out.println("Ordem de Inserção");
        for (Linguagem lingua: MinhasLinguagens) System.out.println(lingua.getNome()+ " -> "+lingua.getAnoDeCriacao()+" -> "+lingua.getIde());

        System.out.println("Ordem Natural (nome)");
        Set<Linguagem> ordenatura = new TreeSet<>(MinhasLinguagens);
        for (Linguagem lingua: ordenatura) System.out.println(lingua.getNome()+ " -> "+lingua.getAnoDeCriacao()+" -> "+lingua.getIde());

        System.out.println("Ordem IDE");
        Set<Linguagem> ordemIde = new TreeSet<>(new CompareIde());
        ordemIde.addAll(MinhasLinguagens);
        for (Linguagem lingua: ordemIde) System.out.println(lingua.getNome()+ " -> "+lingua.getAnoDeCriacao()+" -> "+lingua.getIde());

        System.out.println("Ordem Ano de criação e nome");
        Set<Linguagem> ordemAnoNome = new TreeSet<>(new compareAnoNome());
        ordemAnoNome.addAll(MinhasLinguagens);
        for (Linguagem lingua: ordemAnoNome) System.out.println(lingua.getNome()+ " -> "+lingua.getAnoDeCriacao()+" -> "+lingua.getIde());

        System.out.println("Ordem Nome, ano de criacao e IDE");
        Set<Linguagem> nomeAnoIde = new TreeSet<>(new CompareNomeanodecriacaoIDE());
        nomeAnoIde.addAll(MinhasLinguagens);
        for (Linguagem lingua: nomeAnoIde) System.out.println(lingua.getNome()+ " -> "+lingua.getAnoDeCriacao()+" -> "+lingua.getIde());
    }

}




/*
class Linguagem implements Comparable <Linguagem>{
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public Linguagem(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return anoDeCriacao == linguagem.anoDeCriacao && nome.equals(linguagem.nome) && ide.equals(linguagem.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }


    @Override
    public int compareTo(Linguagem linguagem) {

        return Integer.compare(this.getAnoDeCriacao(), linguagem.getAnoDeCriacao());

    }


}

class CompareNome implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem nome1, Linguagem nome2) {
        return nome1.getNome().compareToIgnoreCase(nome2.getNome());

    }
}

class CompareNomeAnoIde implements Comparator<Linguagem> {

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome !=0) return nome;

        int ide = l1.getIde().compareToIgnoreCase(l2.getIde());
        if (ide !=0) return ide;

        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());

    }
}
*/
