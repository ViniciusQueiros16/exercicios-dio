package SET.desafio2;

public class Linguagem implements Comparable<Linguagem> {
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
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        return this.getNome().compareToIgnoreCase(linguagem.getNome());
    }
}
