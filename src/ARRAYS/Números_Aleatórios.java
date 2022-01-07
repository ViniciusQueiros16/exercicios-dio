package ARRAYS;
import java.util.Random;
public class Números_Aleatórios {

    public static void main(String[] args) {
        int vetor[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Random random = new Random();

        for (int i=0; i< vetor.length;i++){
            int numero = random.nextInt(100);
            vetor[i] = numero;


        }

        for (int i=0; i< vetor.length;i++){
            System.out.println(vetor[i]);

        }

    }
}
