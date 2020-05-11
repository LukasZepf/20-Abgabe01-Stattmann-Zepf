package at.fhj.iit;
import java.util.List;

public class Beer extends at.fhj.iit.SimpleDrink {
    /**
     * List of liquid
     */
    protected List<Liquid> ingredients;
    /**
     * Color of beer (Only pale or dark)
     */
    private Color color;
    /**
     * Enum gives the "color" of the beer
     */
    public enum Color {
        PALE, DARK;
    }
    /**
     * Default constructor
     *
     * @param name of the drink
     * @param l name of the liquid
     */
    public Beer(String name, Liquid l) {
        super(name, l);
    }
    /**
     * Creates a SimpleDrink object with given name
     *
     * @param name name of the drink
     * @param l liquid
     * @param color of the beer
     * @param ingredients of the beer
     *
     */
    public Beer(String name, Liquid l, Color color, List<Liquid> ingredients) throws NoBeerException {
        super(name, l);
        this.color = color;
        this.ingredients = ingredients;
        for (int i=0; i<this.ingredients.size(); i++) {
            if (ingredients.get(i).getIsBeer() == false) {
                throw new NoBeerException(ingredients.get(i));
            }
        }


    }
    /**
     * Returns the name of the drink
     *
     * @return name of drink
     */
    public String getName() {
        return l.getName();
    }
    /**
     * Setter for the name
     *
     * @param name
     */
    public void setName(String name) {
        l.setName(name);
    }
    /**
     * Returns the volumne
     *
     * @return volumne of drink
     */
    public double getVolume() {
        return l.getVolume();
    }
    /**
     * Setter for volumne
     *
     * @param volume of drink
     */
    public void setVolume(double volume) {
        l.setVolume(volume);
    }
    /**
     * Returns alcohol percentage
     *
     * @return  of drink
     */
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }
    /**
     * Setter for alcoholpercentage
     *
     * @param alcoholPercent
     */
    public void setAlcoholPercent(double alcoholPercent) {
        l.setAlcoholPercent(alcoholPercent);
    }
    /**
     * Returns the list of ingredients
     *
     * @return ingredients of beer
     */
    public List<Liquid> getIngredients() {
        return ingredients;
    }
    /**
     * Setter for the list of ingredients
     *
     * @param ingredients of drink
     */
    public void setIngredients(List<Liquid> ingredients) {
        this.ingredients = ingredients;
    }
    /**
     * returns color of the beer
     *
     * @return color of beer
     */
    private Color getColor (){
        return color;
    }
}
