package Comparators;

import java.util.Comparator;
import java.util.Objects;

public class familia implements Comparable<familia> {
    private String nome;
    private Integer idade;

    public familia(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        familia familia = (familia) o;
        return nome.equals(familia.nome) && idade.equals(familia.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "familia{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(familia o) {
        return this.getIdade() - o.getIdade();
    }
}
