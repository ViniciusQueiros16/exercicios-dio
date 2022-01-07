package ESTRUTURASDEREPETIÇÃO;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("De qual numero deseja ver a tabuada?");
        int n = ler.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n +" x "+i+" = "+ i*n);
        }
    }
}
