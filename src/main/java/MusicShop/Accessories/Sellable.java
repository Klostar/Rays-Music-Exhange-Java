package MusicShop.Accessories;

public class Sellable extends Accessory {

    public Sellable(String type, double cost, double sell) {
        super(type, cost, sell);
    }


    @Override
    public double calculateMarkup() {
        return super.getSell()/super.getCost();
    }

    @Override
    public double calculateProfit() {
        return super.getSell()-super.getCost();
    }
}
