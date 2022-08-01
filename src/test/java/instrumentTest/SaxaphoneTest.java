package instrumentTest;

import instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxaphone("Brass", "Gold", "WoodWind", 23, 2500);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", saxaphone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", saxaphone.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("WoodWind", saxaphone.getType());
    }

    @Test
    public void hasButtons(){
        assertEquals(23, saxaphone.getButtons());
    }

    @Test
    public void hasPrice(){
        assertEquals(2500, saxaphone.getPrice());
    }

    @Test
    public void canPlay(){
        assertEquals("Baker Street", saxaphone.play());
    }
}
