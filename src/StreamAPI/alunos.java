package StreamAPI;

import java.util.Objects;

public class alunos {
    private String nome;
    private Integer idade;

    public alunos(String nome, Integer idade) {
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
        alunos alunos = (alunos) o;
        return nome.equals(alunos.nome) && idade.equals(alunos.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "alunos{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
