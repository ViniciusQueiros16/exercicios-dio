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




