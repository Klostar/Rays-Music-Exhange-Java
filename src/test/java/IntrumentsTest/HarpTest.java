package IntrumentsTest;

import MusicShop.Instruments.Harp;
import MusicShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {
    Harp harp;

    @Before
    public void before(){
        harp = new Harp(InstrumentType.STRINGS, "Wood", "Brown", "RoseBeck Lily", 200.0, 400.0, "Brimbrum",47);
    }

    @Test
    public void getInstrumentFamily(){
        assertEquals(InstrumentType.STRINGS, harp.getType());
    }

    @Test
    public void getHarpMaterial(){
        assertEquals("Wood", harp.getMaterial());
    }
    @Test
    public void getColourOfHarp(){
        assertEquals("Brown", harp.getColour());
    }
    @Test
    public void getMakeOfHarp(){
        assertEquals("RoseBeck Lily", harp.getMake());
    }
    @Test
    public void getCostOfHarp(){
        assertEquals(200.0, harp.getCost(),0.01);
    }
    @Test
    public void getSellOfHarp(){
        assertEquals(400, harp.getSell(), 0.01);
    }
    @Test
    public void setSellPrice(){
        harp.setSell(300.0);
        assertEquals(300.0, harp.getSell(), 0.01);
    }
    @Test
    public void getNumberOfStrings(){
        assertEquals(47, harp.numberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Brimbrum", harp.canPlay());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.0 , harp.calculateMarkup(),0.01);
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(200.00, harp.calculateProfit(),0.01);
    }

}

