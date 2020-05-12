package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Liquid implementation")
public class SimpleDrinkTest {
    private Liquid l1, l2;
    private SimpleDrink d1, d2;

    /**
     * inits an alcoholic and nonalcoholic liquid for EACH test
     */
    @BeforeEach
    void setup() {
        // SETUP PHASE
        l1 = new Liquid( "Bier", 0.3, 5, true);
        l2 = new Liquid("Limonade", 0.2, 0, false);
        d1 = new SimpleDrink("Bier2", l1);
        d2 = new SimpleDrink("Limo", l2);
    }

    /**
     * tests the constructor with an alcoholic drink
     */

    @Test
    @DisplayName("Testing constructor for Beer")
    public void testConstructorAlcoholic(){
        assertEquals(d1.getVolume(), 0.3, 0.001);
        assertEquals(d1.getAlcoholPercent(), 5, 0.001);
        assertEquals(d1.isAlcoholic(), true);
    }

    /**
     * tests the constructor with a non alcoholic drink
     */

    @Test
    @DisplayName("Testing constructor for Limonade")
    public void testConstructorNonAlcoholic(){
        assertEquals(d2.getVolume(), 0.2, 0.001);
        assertEquals(d2.getAlcoholPercent(), 0, 0.001);
        assertEquals(d2.isAlcoholic(), false);
    }
}

