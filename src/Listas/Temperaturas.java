package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/
public class Temperaturas {
    public static void main(String[] args) {
        List<Double> temp= new ArrayList<>(){};
        Scanner ler = new Scanner(System.in);
        int i=0;
        int j=0;
        double soma=0.0;
        while (i<6){
            System.out.println("Digite uma temperatura");
            double t = ler.nextDouble();
            soma += t;
            temp.add(t);

            i++;
        }


        double media;
        media = soma/6;
        System.out.println(temp);
        System.out.println("Media: "+media);

        while (j<6){
            if (temp.get(j) > media){


                switch (j) {
                    case 0 -> System.out.println("Mês:Janeiro - Temp: " + temp.get(j));
                    case 1 -> System.out.println("Mês:Fevereiro - Temp: " + temp.get(j));
                    case 2 -> System.out.println("Mês:Março - Temp: " + temp.get(j));
                    case 3 -> System.out.println("Mês:Abril - Temp: " + temp.get(j));
                    case 4 -> System.out.println("Mês:Maio - Temp: " + temp.get(j));
                    case 5 -> System.out.println("Mês:Junho - Temp: " + temp.get(j));
                }
            }
            j++;
        }



    }
}



