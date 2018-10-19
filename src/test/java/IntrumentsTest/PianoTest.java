package IntrumentsTest;

import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.PERCUSSION, "wood","Black","Yanama",5000.0,8000.0,36, 52,"Plink Plonk", "Sugar Cane" );
    }

    @Test
    public void hasInstrumentFamily(){
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }


}
