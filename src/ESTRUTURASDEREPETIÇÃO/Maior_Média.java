package ESTRUTURASDEREPETIÇÃO;

import java.util.Scanner;

public class Maior_Média {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int i =0;
        float soma=0;
        float maior=0;


        do {
            System.out.println("Digite uma nota:");
            float nota = ler.nextFloat();
            if (nota > maior){
                maior = nota;
            }
            soma +=nota;
            i++;

        } while (i != 5);
        System.out.println("A maior nota é: "+maior);
        System.out.println("A media é: "+ soma/5);
    }

}
