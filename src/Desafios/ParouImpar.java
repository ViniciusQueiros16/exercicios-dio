package Desafios;

import java.io.IOException;
import java.util.Scanner;

/*Para cada valor lido, mostre uma mensagem em inglês dizendo
se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE)
 ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora
 a descrição correta seja (EVEN NULL), pois por definição zero é par,
 seu programa deverá imprimir apenas NULL.*/

public class ParouImpar {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int val = leitor.nextInt();

            if (val%2==0 && val > 0){
                System.out.println("EVEN POSITIVE");
            }else if (val%2==0 && val < 0){
                System.out.println("EVEN NEGATIVE");
            }else if (val%2==1 && val > 0){
                System.out.println("ODD POSITIVE");
            }else if (val == 0){
                System.out.println("NULL");
            }else {
                System.out.println("ODD NEGATIVE");
            }
        }



        leitor.close();
    }

}