package f290_tp2_desafio_devpizza.domain;

import f290_tp2_desafio_devpizza.domain.pizza.Pizza;
import f290_tp2_desafio_devpizza.domain.factory.PizzaFactory;
import f290_tp2_desafio_devpizza.domain.enums.TipoPizza;

public class Pizzaria {
    
    Pizza pizza = null;
    PizzaFactory factory;
        
    public void criarPizza(TipoPizza tipo) {
        pizza = factory.criarPizza(tipo);
    }
    
    public void delivery() {
        System.out.println(pizza.getDescricao());
    }
    
}
