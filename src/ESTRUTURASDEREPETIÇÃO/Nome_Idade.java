package ESTRUTURASDEREPETIÇÃO;

import java.util.Scanner;

public class Nome_Idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        while (true){
            System.out.println("Digite seu nome:");
            String nome = ler.next();
            if (nome.equals("0")) break;
            System.out.println("Digite sua idade:");
            int idade = ler.nextInt();
            System.out.println("Digite sua altura:");
            float altura = ler.nextFloat();

            System.out.println(nome+" tem "+idade+" anos e "+altura+"cm de altura.");



        }


    }
}
