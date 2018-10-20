package MusicShop.Accessories;

import MusicShop.Instruments.Interfaces.ISell;

public class SheetMusic extends Accessory implements ISell {

    private String genre;

    public SheetMusic(String type, double cost, double sell, String genre) {
        super(type, cost, sell);
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }

    public double calculateMarkup(){
        return this.getSell()/ this.getCost();
    }

    public double calculateProfit(){
        return this.getSell() - this.getCost();
    }

}
