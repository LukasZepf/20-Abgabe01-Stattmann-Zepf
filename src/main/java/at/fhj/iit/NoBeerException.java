package at.fhj.iit;

public class NoBeerException extends Exception {
    //This exception is thrown if Liquid is no beer
    public NoBeerException (Liquid liquid) {
        String liquidName=liquid.getName();

    }

    public String toString() {
        return String.format("Liquid " + liquidName + " is no Beer!");
    }
}
