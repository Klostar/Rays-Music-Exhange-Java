package IntrumentsTest;

import MusicShop.Instrument;
import MusicShop.Instruments.Drums;
import MusicShop.Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){

        drums = new Drums(InstrumentType.PERCUSSION, "wood","silver","Sonor",500.0, 650.0,"BoomBang");
    }

    @Test
    public void drumsHasInstrumentFamily(){
        assertEquals(InstrumentType.PERCUSSION, drums.getType());
    }
}
