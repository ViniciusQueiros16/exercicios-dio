package Desafios;

import java.util.Scanner;

/*A primeira entrada informada é a quantidade de produtos comprados
(1 <= p <= 5). Para cada produto segue a quantidade (1 <= q <= 500)
que o consumidor comprou.-
1001 | R$ 1.50
1002 | R$ 2.50
1003 | R$ 3.50
1004 | R$ 4.50
1005 | R$ 5.50*/
public class MacPRONALTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int produtos=0, quantidade=0;
        double res=0, valor=0;
        int N = Integer.parseInt(sc.nextLine());


        for (int x=0 ; x<N ; x++){
            produtos = sc.nextInt();
            quantidade  = sc.nextInt();

            if (produtos == 1001)
                valor = 1.50;
            else if (produtos == 1002  )
                valor =  2.50 ;
            else if (produtos ==  1003    )
                valor =  3.50  ;
            else if (produtos ==  1004   )
                valor = 4.50;
            else if (produtos ==  1005    )
                valor =   5.50 ;

            res += valor * quantidade;
        }
        System.out.printf("%.2f\n",res);
        sc.close();
    }
}