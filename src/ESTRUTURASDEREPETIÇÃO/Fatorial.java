package ESTRUTURASDEREPETIÇÃO;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Deseja ver o fatorial de qual numero?");
        int n = ler.nextInt();
        int a=1;
        System.out.print(n+"!=");
        for (int i=n;i>0;i--){
            a *=i;
            System.out.print(i);
            if (i>1){
                System.out.print(".");
            }

        }
        System.out.println("="+ a);
    }
}
