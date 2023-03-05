package f290_tp2_desafio_devpizza.domain.factory;

import f290_tp2_desafio_devpizza.domain.pizza.Calabresa;
import f290_tp2_desafio_devpizza.domain.pizza.Pizza;
import f290_tp2_desafio_devpizza.domain.enums.TipoPizza;
import java.util.Arrays;

public class PizzaFactory {
    
    public Pizza criarPizza(TipoPizza tipo) {
        
        Pizza pizza = null;
        
        switch (tipo) {
            case CALABRESA -> pizza = new Calabresa(
                    50D, 
                    "Calabresa Premium", 
                    Arrays.asList(
                            "Molho de tomate",
                            "Calabresa em rodelas", 
                            "Cebola",
                            "Pimenta calabresa em flocos"));
            
            //TODO: Implementar as demais Pizzas
                
            default -> throw new AssertionError();
        }
        
        return pizza;
    }
        
    
}
