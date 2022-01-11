package Desafios;

import java.math.BigInteger;
import java.util.Scanner;

/* o pagamento poderia ser feito em grãos de trigo dispostos em um tabuleiro
de damas, de forma que o primeiro quadrado tivesse apenas um grão, e os quadrados
 subseqüentes, o dobro do quadrado anterior.-que fizesse um programa que recebesse como entrada o número
de quadrados a serem usados em um tabuleiro de damas e apresentasse
a quantidade de kg de trigo correspondente, sabendo que cada 12 grãos do
 cereal correspondem a uma grama. Finalmente, o cálculo da quantidade deverá
 caber em um valor inteiro de 64 bits sem sinal.*/
public class TrigonoTabuleiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;

        while (j<n){
            BigInteger grao= BigInteger.valueOf(1);
            BigInteger todosgraos=BigInteger.valueOf(0);
            BigInteger kilosgrao=BigInteger.valueOf(0);

            int x = sc.nextInt();

            for(int i=1;i<x;i++){
                grao =grao.multiply(BigInteger.valueOf(2));
                todosgraos = todosgraos.add(grao);
                kilosgrao = todosgraos.divide(BigInteger.valueOf(12000));

            }
            System.out.println(kilosgrao+" kg");
            j++;
        }

            sc.close();


    }
}
