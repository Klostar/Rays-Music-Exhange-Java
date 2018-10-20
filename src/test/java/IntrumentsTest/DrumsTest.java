package IntrumentsTest;

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

    @Test
    public void drumsHasMaterial(){
        assertEquals("wood", drums.getMaterial());
    }

    @Test
    public void drumsHasColour(){
        assertEquals("silver", drums.getColour());
    }
    @Test
    public void drumsHasMake(){
        assertEquals("Sonor", drums.getMake());
    }
    @Test
    public void drumsHasCost(){
        assertEquals(500.0, drums.getCost(), 0.01);
    }
    @Test
    public void drumsHasSellCost(){
        assertEquals(650.0, drums.getSell(),0.01);
    }

    @Test
    public void drumsHasMarkUp (){
        assertEquals(1.3, drums.calculateMarkup(),0.01);

    }

    @Test
    public void drumsHasProfit(){
        assertEquals(150.0, drums.calculateProfit(),0.01);
    }

    @Test
    public void drumsCanPlaySong(){
        assertEquals("BoomBang", drums.canPlay());
    }

}
