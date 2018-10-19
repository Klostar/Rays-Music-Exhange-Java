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
        harp = new Harp(InstrumentType.STRINGS, "Wood", "Brown", "Rosebeck Lily", 200.0, 400.0,47);
    }

    @Test
    public void getinstrumentFamily(){
        assertEquals(InstrumentType.STRINGS, harp.getType());
    }
}
