package MusicShop.Instruments;

import MusicShop.Instrument;

public class Piano extends Instrument {
    private int numberOfBlackKeys;
    private int numberOfWhiteKeys;
    private String keysMaterial;

    public Piano(InstrumentType type, String material, String colour, String make, Double cost, Double sell, int numberOfBlackKeys, int numberOfWhiteKeys, String song, String keyMaterial) {
        super(type, material, colour, make, cost, sell, song);
        this.numberOfBlackKeys = numberOfBlackKeys;
        this.numberOfWhiteKeys = numberOfWhiteKeys;
        this.keysMaterial = keyMaterial;
    }

    public int getNumberOfBlackKeys() {
        return this.numberOfBlackKeys;
    }

    public int getNumberOfWhiteKeys() {
        return this.numberOfWhiteKeys;
    }

    public int getTotalNumberOfKeys() {
        return numberOfBlackKeys + numberOfWhiteKeys;
    }

    public String getKeysMaterial() {
        return this.keysMaterial;
    }

    public String canPlay(String song) {
        return song;
    }


}
