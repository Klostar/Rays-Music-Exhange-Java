package MusicShop.Instruments;

import MusicShop.Instrument;

public class Drums extends Instrument {

    public Drums(InstrumentType type, String material, String colour, String make, Double cost, Double sell, String song) {
        super(type, material, colour, make, cost, sell, song);
    }

    public String canPlay(String song) {
        return song;
    }
}
