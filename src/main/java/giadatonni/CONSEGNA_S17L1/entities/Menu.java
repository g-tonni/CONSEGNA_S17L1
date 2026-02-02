package giadatonni.CONSEGNA_S17L1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> listaPizze;
    private List<Topping> listaTopping;
    private List<Bevande> listaBevande;

    public Menu (List<Pizza> listaPizze, List<Topping> listaTopping, List<Bevande> listaBevande){
        this.listaPizze = listaPizze;
        this.listaTopping = listaTopping;
        this.listaBevande = listaBevande;
    }

    public void stampaMenu(){
        System.out.println("Pizze");
        this.listaPizze.forEach(elementoMenu -> System.out.println(elementoMenu));
        System.out.println("");
        System.out.println("Topping");
        this.listaTopping.forEach(elementoMenu -> System.out.println(elementoMenu));
        System.out.println("");
        System.out.println("Bevande");
        this.listaBevande.forEach(elementoMenu -> System.out.println(elementoMenu));
    }
}
