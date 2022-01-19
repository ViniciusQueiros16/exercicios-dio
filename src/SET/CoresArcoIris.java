package SET;

import java.util.*;


public class CoresArcoIris {
    public static void main(String[] args) {
//        Crie um conjunto contendo as cores do arco-íris
        Set<String> cores = new LinkedHashSet<>();
        cores.add("vermelha");
        cores.add("laranja");
        cores.add("amarela");
        cores.add("verde");
        cores.add("azul");
        cores.add("violeta");
//        Exiba todas as cores uma abaixo da outra
        for (String cor:cores) System.out.println(cor);
//        A quantidade de cores que o arco-íris tem
        System.out.println("Quantidade de cores do arco-iris: "+cores.size());
//        Exiba as cores em ordem alfabética
        List<String> ordenalfa = new ArrayList<>(cores);
        Collections.sort(ordenalfa);
        System.out.println("orden alfabetica-> "+ordenalfa);
//      Exiba as cores na ordem inversa da que foi informada
        List<String> ordeninversa = new ArrayList<>(cores);
        Collections.reverse(ordeninversa);
        System.out.println("orden inversa-> "+ordeninversa);
//      Exiba todas as cores que começam com a letra ”v”
        List<String> listset = new ArrayList<>(cores);
        for (String comv:listset){
            if (comv.contains("v")) System.out.println(comv);
        }
//      Remova todas as cores que não começam com a letra “v”
        for (int i=0;i< listset.size();i++){
            if (listset.get(i).contains("v")){
                listset.remove(i);
            }
        }
        System.out.println("cores que não começam com a letra “v”"+listset);
//      Limpe o conjunto
        cores.clear();
        System.out.println(cores);
//        Confira se o conjunto está vazio
        System.out.println("Tá vazio? "+cores.isEmpty());

    }

}
