package MusicShop.Instruments;

import MusicShop.Instrument;

public class Saxaphone extends Instrument {

    private String reed;

    public Saxaphone(InstrumentType type, String material, String colour, String make, Double cost, Double sell, String song, String reed) {
        super(type, material, colour, make, cost, sell, song);
        this.reed = reed;
    }


    @Override
    public String canPlay(String song) {
        return song;
    }
}
