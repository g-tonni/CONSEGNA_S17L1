package giadatonni.CONSEGNA_S17L1.entities;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Pizza extends ElementoMenu{
    private List<Topping> listaTopping;

    public Pizza(String name, List<Topping> listaTopping){
        super(name);
        this.listaTopping = listaTopping;
        this.setCalorie(1000);
        this.setPrezzo(4);
        for (int i = 0; i<listaTopping.size(); i++){
            this.setCalorie(this.getCalorie() + listaTopping.get(i).getCalorie());
            this.setPrezzo(this.getPrezzo() + listaTopping.get(i).getPrezzo());
        }

    }
}
