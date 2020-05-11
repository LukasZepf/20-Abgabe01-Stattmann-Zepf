package at.fhj.iit;
/**
 * Class represents a liquid which can be used in
 * drinks
 */
public class Liquid {
    /**
     * name of liquid
     */
    private String name;
    /**
     * volume of liquid (in liter)
     */
    private double volume;

    /**
     * alcoholPercent of liquid (in percent eg. 42)
     */
    private double alcoholPercent;

    /**
     * isBeer (is true if liquid is beer)
     */
    private boolean isBeer;

    /**
     * Creates new liquid with given name, volume and
     * alcoholPercent
     *
     * @param name name of liquid
     * @param volume volume of liquid
     * @param alcoholPercent of liquid
     * @param isBeer of liquid
     */
    public Liquid(String name, double volume, double alcoholPercent, boolean isBeer) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
        this.isBeer = isBeer;
    }

    /**
     * Getter for name
     *
     * @return name of liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for volume
     *
     * @return volume of liquid (in liter)
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Setter for volume
     *
     * @param volume new volume
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Getter for alcoholPercent
     *
     * @return alcoholPercent (e.g. 40)
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }
    /**
     * Setter for alcoholPercent
     *
     * @param alcoholPercent new alcoholPercent
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Getter for isBeer
     *
     * @return boolean if liquid is beer
     */
    public boolean getIsBeer() {
        return isBeer;
    }

    /**
     * Setter for isBeer
     *
     * @param if liquid is beer
     */
    public void setIsBeer(boolean isBeer) {
        this.isBeer = isBeer;
    }

}
