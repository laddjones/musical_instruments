/**
 * Represents a flute instrument
 * @author Ladd Jones
 * @version Oct.15 2015
 */
public class Flute extends Woodwind {
    private double sizeOfFlute;
    private String fluteTone;

    /**
     * Constructor intilizes the price, reedSize, sizeOfFlute, and
     * fluteTone
     * @param price           price of flute
     * @param reedSize        reed size of flute
     * @param sizeOfFlute     size of flute
     * @param fluteTone       tone of flute
     */
    public Flute(double price, double reedSize,
        double sizeOfFlute, String fluteTone) {
        super(price, reedSize);
        this.sizeOfFlute = sizeOfFlute;
        this.fluteTone = fluteTone;

    }

    /**
     * Method overides the toString method
     * @return a new string containg price and serial number
     */
    public String toString() {
        return "The Flute's Price is " + this.getPrice() + "/n"
            + "The serial number is " + this.getSerialNumber();
    }

    /**
     * Method plays the sound of a flute
     * @return a string containg the noise
     */
    public String play() {
        return "flalalala";
    }
}
