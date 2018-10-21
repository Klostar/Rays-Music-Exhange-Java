package IntrumentsTest;

import MusicShop.Accessories.Sellable;
import MusicShop.Accessories.SheetMusic;
import MusicShop.Instruments.*;
import MusicShop.Instruments.Interfaces.ISell;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ShopTest {
    Shop shop;
    Harp harp;
    Drums drums;
    Piano piano;
    Saxaphone saxaphone;
    SheetMusic sheetMusic;
    SheetMusic sheetMusic2;
    Sellable sellable;



    @Before
    public void before(){
        harp = new Harp(InstrumentType.STRINGS, "Wood", "Brown", "RoseBeck Lily", 200.0, 400.0, "Brimbrum",47);
        drums = new Drums(InstrumentType.PERCUSSION, "wood","silver","Sonor",500.0, 650.0,"BoomBang");
        piano = new Piano(InstrumentType.PERCUSSION, "wood","Black","Yamaha",5000.0,8000.0,36, 52,"Plink Plonk", "Sugar Cane" );
        saxaphone = new Saxaphone(InstrumentType.WOODWIND,"Brass", "Gold", "Yamaha",750.0, 965.0, "nononooo", "rubber");
        sheetMusic = new SheetMusic("Sheet Music", 2.00, 10.0,"Rock");
        sheetMusic2 = new SheetMusic("Sheet Music", 2.0, 8.0, "Pop");
        sellable = new Sellable("Drum Sticks", 16.00 , 20.00);

        ArrayList<ISell> stock = new ArrayList<>();

        shop = new Shop(stock);

    }

    @Test
    public void shopStockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemsToShopStock(){
        shop.addStock(harp);
        shop.addStock(drums);
        shop.addStock(piano);
        shop.addStock(saxaphone);
        shop.addStock(sheetMusic);
        shop.addStock(sheetMusic2);
        shop.addStock(sellable);
        assertEquals(7, shop.stockCount());

    }


}

