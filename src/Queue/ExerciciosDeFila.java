package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExerciciosDeFila {
    public static void main(String[] args) {
        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome:nomes) System.out.println(nome);

        System.out.println("Primeiro nome da fila: "+nomes.peek());
        System.out.println("Primeiro nome da fila Removido: "+nomes.poll());
        for (String nome:nomes) System.out.println(nome);
        nomes.add("Daniel");
        for (String nome:nomes) System.out.println("-->"+nome);
        System.out.println("Tamanho da fila: "+nomes.size());
        System.out.println("A fila esta vazia: "+nomes.isEmpty());
        System.out.println(nomes.contains("Carlos"));

    }
}
