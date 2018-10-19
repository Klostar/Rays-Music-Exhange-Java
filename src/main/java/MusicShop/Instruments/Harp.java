package MusicShop.Instruments;

import MusicShop.Instrument;

public class Harp extends Instrument {

    private int numberOfStrings;

    public Harp(InstrumentType type, String material, String colour, String make, Double cost, Double sell, int numberOfStrings) {
        super(type, material, colour, make, cost, sell);
        this.numberOfStrings = numberOfStrings;
    }



}
