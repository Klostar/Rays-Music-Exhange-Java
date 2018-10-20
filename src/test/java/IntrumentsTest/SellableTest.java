package IntrumentsTest;

import MusicShop.Accessories.Sellable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellableTest {
    Sellable sellable;
    Sellable sellable2;

    @Before
    public void before(){
        sellable = new Sellable("Drum Sticks", 16.00 , 20.00);
        sellable2 = new Sellable("Guitar Strings", 7.00, 10.00);

    }

    @Test
    public void sellableItemHasType(){
       assertEquals("Guitar Strings", sellable2.getType());
    }

    @Test
    public void getCost(){
        assertEquals(16.00, sellable.getCost(), 0.01);
    }

    @Test
    public void getSell(){
        assertEquals(10.0, sellable2.getSell(),0.01);
    }

    @Test
    public void canCalculateMargin(){
        assertEquals(1.25, sellable.calculateMarkup(),0.01);
    }
    @Test
    public void canCalculateProfit(){
        assertEquals(3.00, sellable2.calculateProfit(), 0.01);
    }
}

