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
        l1 = new Liquid( "Radler", 0.3, 5, true);
        l2 = new Liquid("Limonade", 0.2, 0, false);
        l3 = new Liquid("Bier", 0.5, 0, true);

        List<Liquid> ingredients = new ArrayList<Liquid>();
        ingredients.add(l1);
        ingredients.add(l2);
        List<Liquid> ingredients2 = new ArrayList<Liquid>();
        ingredients2.add(l1);
        ingredients2.add(l3);
        //b1 = new Beer(l1, Beer.Color.PALE, ingredients);
        b2 = new Beer(l3, Beer.Color.DARK, ingredients2);
    }

    @Test
    @DisplayName("Testing constructor Liquid")
    public void testConstructorLiquid() {
        assertEquals(l1.getName(), "Radler");
        assertEquals(l1.getVolume(), 0.3, 0.001);
        assertEquals(l1.getAlcoholPercent(), 5, 0.001);
        assertEquals(l1.getIsBeer(), true);
    }

    @Test
    @DisplayName("Testing constructor Beer")
    public void testConstructorBeer() {
        assertEquals(b2.getName(), "Bier");
        assertEquals(b2.getColor(), Beer.Color.DARK);
        List<Liquid> ingredients = b2.getIngredients();
        assertEquals(ingredients.get(0), l1);
        assertEquals(ingredients.get(1), l3);
    }

    @Test
    @DisplayName("Test name setter")
    public void testNameSetter(){
        l1.setName("Test1");
        assertEquals(l1.getName(), "Test1");
    }

    @Test
    @DisplayName("Testing volume setter")
    public void testVolumeSetter(){
        l1.setVolume(1.5);
        assertEquals(l1.getVolume(), 1.5, 0.001);
    }

    @Test
    @DisplayName("Testing alcoholPercent setter")
    public void testAlcoholPercentSetter(){
        l1.setVolume(9);
        assertEquals(l1.getVolume(), 9, 0.001);
    }

    @Test
    @DisplayName("Testing isBeer setter")
    public void testIsBeerSetter(){
        l1.setIsBeer(false);
        assertEquals(l1.getIsBeer(), false);

    }

    @Test
    @DisplayName("Testing Ingredient setter")
    public void testIngredientsSetter() {
        List<Liquid> ingredients = new ArrayList<Liquid>();
        ingredients.add(l1);
        ingredients.add(l2);
        b2.setIngredients(ingredients);
        assertEquals(b2.getIngredients().get(0), l1);
        assertEquals(b2.getIngredients().get(1), l2);
    }

}
