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
        harp = new Harp(InstrumentType.STRINGS, "Wood", "Brown", "Rosebeck Lily", 200.0, 400.0,47, "Brimbrum");
    }

    @Test
    public void getinstrumentFamily(){
        assertEquals(InstrumentType.STRINGS, harp.getType());
    }

    @Test
    public void getHarpMaterial(){
        assertEquals("Wood", harp.getMaterial());
    }
    @Test
    public void getColourofHarp(){
        assertEquals("Brown", harp.getColour());
    }
    @Test
    public void getMakeofHarp(){
        assertEquals("Rosebeck Lily", harp.getMake());
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

}

