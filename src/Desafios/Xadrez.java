package Desafios;

import java.util.Scanner;

/*
Imprima uma linha na saída. A linha deve conter um inteiro,
representando a cor da casa no canto inferior
direito do tabuleiro, e para identificar, considere o inteiro
1 para a cor branca e 0 para a cor preta.
*/

public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if (( L%  2  )     ==0)
            System.out.println(" 0  ");
        else                                               //complete o código nos espaços em branco
            System.out.println("  1 ");
        sc.close();
    }
}
