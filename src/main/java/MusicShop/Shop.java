package MusicShop;

import MusicShop.Instruments.Interfaces.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock){
        this.stock = new ArrayList<>();
    }


    public int stockCount() {
        return stock.size();
    }

     public void addStock(ISell stock){
        this.stock.add(stock);
     }

    public void sellStock(ISell stock) {
       this.stock.remove(stock);
    }

    public double getTotalProfit() {
       int totalProfit = 0;
        for (ISell item : stock ) {
         totalProfit += item.calculateProfit();
        }
        return totalProfit;
    }
}
