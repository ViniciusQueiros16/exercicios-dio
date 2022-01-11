package Desafios;

import java.util.Scanner;

/*desenvolva um aplicativo que, a partir da hora de saída,
tempo de viagem e fuso horário do destino comparado ao país
de origem, informe a hora de chegada de cada vôo no destino. */
public class FusoHorário {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();

        int ajuste = horasaida + (tempoviagem + fuso);

        if (ajuste == 24){
            ajuste = 0;
        }else if (ajuste > 24){
            ajuste = ajuste -24;
        }else if (ajuste < 0){
            ajuste = 24+ajuste;
        }

        System.out.println(ajuste);

        sc.close();
    }
}
