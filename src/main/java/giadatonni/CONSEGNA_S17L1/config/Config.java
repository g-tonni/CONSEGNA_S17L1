package giadatonni.CONSEGNA_S17L1.config;

import giadatonni.CONSEGNA_S17L1.entities.Bevande;
import giadatonni.CONSEGNA_S17L1.entities.Menu;
import giadatonni.CONSEGNA_S17L1.entities.Pizza;
import giadatonni.CONSEGNA_S17L1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {
    @Bean
    public Topping cipolle (){
        return new Topping("Cipolle", 22, 0.80);
    }
    @Bean
    public Topping pomodoro (){
        return new Topping("Pomodoro", 80, 1.20);
    }
    @Bean
    public Topping mozzarella (){
        return new Topping("Mozzarella", 92, 0.90);
    }
    @Bean
    public Topping prosciutto (){
        return new Topping("Prosciutto", 35, 0.80);
    }
    @Bean
    public Topping ananas (){
        return new Topping("Ananas", 24, 0.60);
    }
    @Bean
    public Topping salame (){
        return new Topping("Salame", 36, 0.80);
    }

    @Bean
    public Pizza margherita(){
        List<Topping> topping = new ArrayList<>(Arrays.asList(pomodoro(), mozzarella()));
        return new Pizza("Margherita", topping);
    }

    @Bean
    public Pizza pizzaAnanas(){
        List<Topping> topping = new ArrayList<>(Arrays.asList(pomodoro(), mozzarella(), prosciutto(), ananas()));
        return new Pizza("Pizza con ananas", topping);
    }

    @Bean
    public Pizza pizzaSalame(){
        List<Topping> topping = new ArrayList<>(Arrays.asList(pomodoro(), mozzarella(), salame()));
        return new Pizza("Pizza con salame", topping);
    }

    @Bean
    public Pizza pizzaCipolle(){
        List<Topping> topping = new ArrayList<>(Arrays.asList(pomodoro(), mozzarella(), prosciutto(), cipolle()));
        return new Pizza("Pizza con cipolle", topping);
    }

    @Bean
    public Bevande acqua(){
        return new Bevande("Acqua", 0, 1.30, 0);
    }

    @Bean
    public Bevande cocaCola(){
        return new Bevande("Acqua", 100, 2.50, 0.33);
    }

    @Bean
    public Bevande vino(){
        return new Bevande("Acqua", 607, 7.5, 13, 0.75);
    }

    @Bean
    public Menu menu(){
        List<Pizza> listaPizze = new ArrayList<>(Arrays.asList(margherita(), pizzaAnanas(), pizzaCipolle(), pizzaSalame()));
        List<Topping> listaTopping = new ArrayList<>(Arrays.asList(pomodoro(), mozzarella(), cipolle(), prosciutto(), salame(), ananas()));
        List<Bevande> listaBevande = new ArrayList<>(Arrays.asList(acqua(), cocaCola(), vino()));
        return new Menu(listaPizze, listaTopping, listaBevande);
    }
}
