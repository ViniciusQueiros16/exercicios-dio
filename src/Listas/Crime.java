package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma
        pessoa sobre um crime. As perguntas são:
        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2 questões ela deve ser
        classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
        "Assassina". Caso contrário, ela será classificado como "Inocente".*/
public class Crime {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();
        int cont=0;

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        for (String s : perguntas) {
            System.out.println(s);
            String pergunta = ler.next();
            if (pergunta.equals("sim")) cont++;
        }
        System.out.println(cont);

        if ( cont == 2){
            System.out.println("Suspeita");
        }else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        }else if (cont == 5){
            System.out.println("Assassina");
        }else System.out.println("Inocente");


    }
}
