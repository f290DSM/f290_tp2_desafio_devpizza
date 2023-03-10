package f290_tp2_desafio_devpizza;

import f290_tp2_desafio_devpizza.domain.Pizzaria;
import f290_tp2_desafio_devpizza.domain.enums.TipoPizza;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        var pizzaria = new Pizzaria();
        
        //TODO: Cliente executa logica para selecionar o tipo
        System.out.println("Selecione o tipo de Pizza:");
        //TODO: Criar um menu melhorinho =(
        System.out.println("1. CALABRESA...");
        int idPizza = in.nextInt();
        
        
        //TODO: Converter entrada em um tipo do enum TipoPizza
        TipoPizza tipo = TipoPizza.getTipo(idPizza);
        
        // Execução do contexto
        pizzaria.criarPizza(tipo);
        pizzaria.delivery();
        
        in.close();
    }
    
}
