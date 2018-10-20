package MusicShop.Instruments;

import MusicShop.Instrument;

public class Harp extends Instrument {


    private int numberOfStrings;

    public Harp(InstrumentType type, String material, String colour, String make, Double cost, Double sell, String song,int numberOfStrings) {
        super(type, material, colour, make, cost, sell, song);
        this.numberOfStrings = numberOfStrings;



    }

    public String canPlay(String song) {
        return song;
    }


    public int numberOfStrings() {
        return numberOfStrings;
    }
}
