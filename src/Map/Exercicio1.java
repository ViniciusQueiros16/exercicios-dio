package Map;

import java.math.BigDecimal;
import java.util.*;

/*Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265*/

public class Exercicio1 {
    public static void main(String[] args) {
//        Crie um dicionário e relacione os estados e assuas populações;
        Map<String, Integer> regioes = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(regioes);
        //Substitua a população do estado do RN por 3.534.165;
        regioes.put("RN",3534165);
        System.out.println(regioes);
//Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        if (!regioes.containsKey("PB")) regioes.put("PB", 4039277);
        System.out.println(regioes);
//Exiba a população PE;
        System.out.println(regioes.get("PE"));
//Exiba todos os estados e suas populações na ordem informado;
        Map<String, Integer> regioes2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(regioes2);
//Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> regioes3 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(regioes3);
//Exiba o estado com o menor população e sua quantidade;
        int menorpopulacao = Collections.min(regioes3.values());
        String regiaoMenosGente = "";
        for (Map.Entry<String, Integer> entry: regioes3.entrySet()) {
            if (entry.getValue().equals(menorpopulacao)){
                regiaoMenosGente = entry.getKey();
            }
        }
        System.out.println("Estado com menor população: "+regiaoMenosGente +" - "+ menorpopulacao);

//        Exiba o estado com a maior população e sua quantidade;
        int maiorpopulacao = Collections.max(regioes3.values());
        String regiaoMaisGente = "";
        for (Map.Entry<String, Integer> entry: regioes3.entrySet()) {
            if (entry.getValue().equals(maiorpopulacao)){
                regiaoMaisGente = entry.getKey();
            }
        }
        System.out.println("Estado com maior população: "+regiaoMaisGente +" - "+ maiorpopulacao);
//        Exiba a soma da população desses estados;
        Iterator<Integer> iterator = regioes3.values().iterator();
        int soma =0;
        while (iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("soma da população desses estados "+soma);
//        Exiba a média da população deste dicionário de estados;
        System.out.println("Média da população deste dicionário de estados "+soma/ regioes3.size());
//        Remova os estados com a população menor que 4.000.000;
        int menor=4000000;
        regioes3.values().removeIf(integer -> integer < menor);
        System.out.println(regioes3);
//        Apague o dicionário de estados;
        regioes.clear();
//        Confira se o dicionário está vazio.
        System.out.println(regioes.isEmpty());


    }
}



