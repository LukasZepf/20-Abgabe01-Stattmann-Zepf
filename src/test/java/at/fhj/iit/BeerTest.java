package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BeerTest {
    private Beer b1, b2;
    private Liquid l1, l2, l3;

    @BeforeEach
    void setup() throws NoBeerException {
        // SETUP PHASE
        l1 = new Liquid( "Bier", 0.3, 5, true);
        l2 = new Liquid("Limonade", 0.2, 0, false);
        l3 = new Liquid("Bier2", 0.5, 0, true);

        List<Liquid> ingredients = new ArrayList<Liquid>();
        ingredients.add(l1);
        ingredients.add(l2);
        List<Liquid> ingredients2 = new ArrayList<Liquid>();
        ingredients.add(l1);
        ingredients.add(l3);
        //b1 = new Beer("Radler", l1, Beer.Color.PALE, ingredients);
        b2 = new Beer("Bier", l3, Beer.Color.DARK, ingredients2);
    }

    @Test
    @DisplayName("Testing constructor Liquid")
    public void testConstructorLiquid() {
        assertEquals(l1.getName(), "Bier");
        assertEquals(l1.getVolume(), 0.3, 0.001);
        assertEquals(l1.getAlcoholPercent(), 5, 0.001);
        assertEquals(l1.getIsBeer(), true);
    }

    @Test
    @DisplayName("Testing constructor Beer")
    public void testConstructorBeer() {
        assertEquals(b2.getName(), "Bier");
        assertEquals(b2.getColor(), Beer.Color.DARK);
        List<Liquid> ingredients = b1.getIngredients();
        assertEquals(ingredients.get(0), l1);
        assertEquals(ingredients.get(0), l3);
    }


}
