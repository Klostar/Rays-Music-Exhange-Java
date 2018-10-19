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
        piano = new Piano(InstrumentType.PERCUSSION, "wood","Black","Yamaha",5000.0,8000.0,36, 52,"Plink Plonk", "Sugar Cane" );
    }

    @Test
    public void hasInstrumentFamily(){
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }

    @Test
    public void pianoHasMaterial(){
        assertEquals("wood", piano.getMaterial());

    }

    @Test
    public void pianoHasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void pianoHasMake(){
        assertEquals("Yamaha", piano.getMake());
    }

    @Test
    public void pianoHasCost(){
        assertEquals(5000.0, piano.getCost(), 0.01);
    }

    @Test
    public void pianoHasSellPrice(){
        assertEquals(8000.0, piano.getSell(), 0.01);
    }

    @Test
    public void numberOFWhiteKeys(){
        assertEquals(52, piano.getNumberOfWhiteKeys());
    }
    @Test
    public void numberOfBlackKeys(){
        assertEquals(36, piano.getNumberOfBlackKeys(),0.01);
    }

    @Test
    public void canGetTotalNumberOfKeys(){
        assertEquals(88, piano.getTotalNumberOfKeys());
    }

    @Test
    public void canGetKeysMaterial(){
        assertEquals("Sugar Cane", piano.getKeysMaterial());
    }

    @Test
    public void canPlaySong(){
        assertEquals("Plink Plonk", piano.canPlay());
    }
}
