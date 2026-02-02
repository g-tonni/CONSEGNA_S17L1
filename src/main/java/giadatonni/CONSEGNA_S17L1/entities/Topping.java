package giadatonni.CONSEGNA_S17L1.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Topping extends ElementoMenu{
    public Topping(String name, int calorie, double prezzo){
        super(name, calorie, prezzo);
    }
}
