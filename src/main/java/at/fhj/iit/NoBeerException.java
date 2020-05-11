package at.fhj.iit;

public class NoBeerException extends Exception {
    //This exception is thrown if Liquid is no beer
    String liquidName;
    public NoBeerException (Liquid liquid) {
        this.liquidName=liquid.getName();
    }
    public String toString() {
        return String.format("Liquid " + this.liquidName + " is no Beer!");
    }
}
