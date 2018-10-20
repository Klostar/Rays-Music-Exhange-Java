package IntrumentsTest;

import MusicShop.Instruments.InstrumentType;
import MusicShop.Instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxaphone(InstrumentType.WOODWIND,"Brass", "Gold", "Yamaha",750.0, 965.0, "nononooo", "rubber");
    }

    @Test
    public void saxHasInstrumentFamily(){
        assertEquals(InstrumentType.WOODWIND, saxaphone.getType());
    }
    @Test
    public void saxHasMaterial(){
        assertEquals("Brass", saxaphone.getMaterial());
    }
    @Test
    public void saxHasColour(){
        assertEquals("Gold", saxaphone.getColour());
    }

    @Test
    public void saxHAsMake(){
        assertEquals("Yamaha", saxaphone.getMake());
    }

    @Test
    public void saxHasCost(){
        assertEquals(750.0 , saxaphone.getCost(),0.01);

    }

    @Test
    public void saxHasSell(){
        assertEquals(965.0, saxaphone.getSell(),0.01);
    }

    @Test
    public void saxHasMarkUp(){
        assertEquals(1.29, saxaphone.calculateMarkup(),0.01);
    }

    @Test
    public void saxCanCalculateProfit(){
        assertEquals(215, saxaphone.calculateProfit(), 0.01);
    }

    @Test
    public void canPlaySong(){
        assertEquals("nononooo", saxaphone.canPlay());
    }
}

