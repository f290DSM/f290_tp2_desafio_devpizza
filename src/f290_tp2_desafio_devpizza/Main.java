package f290_tp2_desafio_devpizza;

import f290_tp2_desafio_devpizza.domain.Pizzaria;
import f290_tp2_desafio_devpizza.domain.enums.TipoPizza;

public class Main {

    public static void main(String[] args) {
        
        var pizzaria = new Pizzaria();
        
        //TODO: Cliente executa logica para selecionar o tipo
        
        // Execução do contexto
        pizzaria.criarPizza(TipoPizza.CALABRESA);
        pizzaria.delivery();
    }
    
}
