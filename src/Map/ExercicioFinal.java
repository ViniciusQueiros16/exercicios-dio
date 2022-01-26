package Map;

import java.util.HashMap;
import java.util.Map;

public class ExercicioFinal {
    public static void main(String[] args) {
        Map<String,String>  estados = new HashMap<>();

        estados.put("AP","Amapá");
        estados.put("AM","Amazonas" );
        estados.put("CE","Ceará");
        estados.put("MG","Minas Gerais");
        estados.put("GO","Goiás");
        estados.put("BA","Bahia");
        estados.put("RJ","Rio de Janeiro");
        estados.put("SP","São Paulo");


        System.out.println(estados);
        estados.remove("MG");
        System.out.println(estados);
        estados.put("DF","Distrito Federal");
        System.out.println(estados);
        System.out.println(estados.size());
        estados.remove("GO","Goiás");
        System.out.println(estados);

        for (Map.Entry<String,String> entry: estados.entrySet()) {
            System.out.println(entry.getValue()+"("+entry.getKey()+")");
        }

        System.out.println(estados.containsKey("SC"));
        System.out.println(estados.containsValue("Amazonas"));


    }
}
