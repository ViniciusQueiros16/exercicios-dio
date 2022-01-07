package ESTRUTURASDEREPETIÇÃO;

import java.util.Scanner;

public class Par_Ímpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i=0;
        int impar=0;
        int par=0;
        System.out.println("Digite a quantidade de números: ");
        int quant = ler.nextInt();
        do {
            System.out.println("Digite um numero:");
            int nota = ler.nextInt();
            if (nota %2==0){
                par +=1;
            }else {
                impar += 1;
            }
            i++;
        } while (i != quant);

        System.out.println("Números pares: "+par);
        System.out.println("Números impares: "+impar);
    }
}
