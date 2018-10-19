package MusicShop;

import MusicShop.Instruments.InstrumentType;

public abstract class Instrument {

    private InstrumentType type;
    private String material;
    private String colour;
    private String make;
    private Double cost;
    private Double sell;

    public Instrument(InstrumentType type, String material, String colour, String make, Double cost, Double sell){
        this.type = type;
        this.material = material;
        this.colour = colour;
        this.make = make;
        this.cost = cost;
        this.sell = sell;

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
}
