package ESTRUTURASDEREPETIÇÃO;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int nota=1000;

        while (nota <0 || nota >10){
            System.out.println("Digite uma nota entre zero e dez:");
            nota = ler.nextInt();
            if (nota <0 || nota >10){
                System.out.println("Valor invalido! Digite novamente.");
            }

        }
    }
}
