package MusicShop.Accessories;

import MusicShop.Instruments.Interfaces.ISell;

public abstract class Accessory implements ISell {
    private String type;
    private double cost;
    private double sell;


    public Accessory(String type, double cost, double sell){
        this.type = type;
        this.cost = cost;
        this.sell = sell;

    }

    public String getType() {
        return type;
    }

    public double getCost() {
        return cost;
    }

    public double getSell() {
        return sell;
    }
}
