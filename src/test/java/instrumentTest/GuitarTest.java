package instrumentTest;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;


    @Before
    public void before(){
        guitar = new Guitar("Maple","Natural", "Electric", 6, 689 );
    }

    @Test
    public void hasMaterial(){
        assertEquals("Maple", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Natural", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void hasString(){
        assertEquals(6,guitar.getStrings());
    }

    @Test
    public void hasPrice(){
        assertEquals(689, guitar.getPrice());
    }

    @Test
    public void canPlay(){
        assertEquals("Wonder Wall", guitar.play());
    }
}
