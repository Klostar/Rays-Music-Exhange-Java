package MusicShop;

import MusicShop.Instruments.Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock){
        stock = new ArrayList<>();
    }

    public ArrayList getStock(){
        return stock;
    }

}
