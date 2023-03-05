package f290_tp2_desafio_devpizza;

import f290_tp2_desafio_devpizza.domain.Pizzaria;
import f290_tp2_desafio_devpizza.domain.enums.TipoPizza;

public class F290_tp2_desafio_devpizza {

    public static void main(String[] args) {
        // TODO code application logic here
        
        var pizzaria = new Pizzaria();
        
        //TODO: Cliente executa logica para selecionar o tipo
        pizzaria.criarPizza(TipoPizza.CALABRESA);
        pizzaria.entregar();
    }
    
}
