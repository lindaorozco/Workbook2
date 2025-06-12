package week7.Interfaces.Portfolio;

import Week5.AssetManager.Asset;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> valuableList = new ArrayList<>();

    // Add to the asset list
    public void add (Valuable valuable){
     valuableList.add(valuable);

    }
    // calc the Total Value
    public double getValue (){
        // variable to hold
        double total = 0;
        // loop to get the asset value
        for (Valuable valuable : valuableList){
            total += valuable.getValue();
        }
        return total;
    }
}
