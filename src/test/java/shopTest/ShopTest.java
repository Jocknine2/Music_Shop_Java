package shopTest;

import instruments.Guitar;
import instruments.Saxaphone;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Saxaphone saxaphone;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Maple","Natural", "Electric", 6, 689 );
        saxaphone = new Saxaphone("Brass", "Gold", "WoodWind", 23, 2500);
    }

    @Test
    public void shopHasStock(){
        assertEquals(0, shop.getStock());
    }

    @Test
    public void shopCanAddStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void shopCanRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(saxaphone);
        shop.removeStock(saxaphone);
        assertEquals(1, shop.getStock());

    }


}
