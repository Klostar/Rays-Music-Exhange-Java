package IntrumentsTest;

import MusicShop.Accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;
    SheetMusic sheetMusic2;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Sheet Music", 2.00, 10.0,"Rock");
        sheetMusic2 = new SheetMusic("Sheet Music", 2.0, 8.0, "Pop");
    }

    @Test
    public void getType(){
        assertEquals("Sheet Music", sheetMusic.getType());
    }

    @Test
    public void getCost(){
        assertEquals(2.0, sheetMusic.getCost(),0.01);
    }
    @Test
    public void getSell(){
        assertEquals(8.0, sheetMusic2.getSell(),0.01);
    }
    @Test
    public void getGenre(){
        assertEquals("Rock", sheetMusic.getGenre());
    }
}
