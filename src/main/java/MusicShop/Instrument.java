package MusicShop;

import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Interfaces.IPlay;
import MusicShop.Instruments.Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private InstrumentType type;
    private String material;
    private String colour;
    private String make;
    private Double cost;
    private Double sell;
    private String song;


    public Instrument(InstrumentType type, String material, String colour, String make, Double cost, Double sell,String song){
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.make = make;
        this.cost = cost;
        this.sell = sell;
        this.song = song;

    }

    public InstrumentType getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public Double getCost() {
        return cost;
    }

    public Double getSell() {
        return sell;
    }

    public void setSell(double sell ){
     this.sell = sell;
    }

    public String canPlay(){
        return this.song;
    }

    public double calculateMarkup(){
     return this.sell / this.cost;
    }

    public double calculateProfit(){
        return this.sell - this.cost;
    }
}
