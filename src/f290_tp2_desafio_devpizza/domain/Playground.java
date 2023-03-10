package f290_tp2_desafio_devpizza.domain;

import java.util.Arrays;
import java.util.List;


public class Playground {
    public static void main(String[] args) {
        
        List<String> nomes = Arrays.asList(
                "Daniel", "Valdelaine", "Gabriel"
        );
        
        for (String n: nomes) {
            String arg = n;
            System.out.println(arg);
        }
    }
}
