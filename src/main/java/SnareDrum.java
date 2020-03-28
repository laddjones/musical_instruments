/**
 * Represents a snaredrum
 * @author Ladd Jones
 * @version Oct.15 2015
 */
public class SnareDrum extends Percussion {
    private double sizeOfDrum;
    private String materialOfDrum;

    /**
     * Constructor intilizes the price, coverThickness, sizeOfDrum, and
     * materialOfDrum
     * @param price           price of snare drum
     * @param coverThickness  coverThickness of snare drum
     * @param sizeOfDrum      size of snare drum
     * @param materialOfDrum  material of snare drum
     */
    public SnareDrum(double price, double coverThickness,
        double sizeOfDrum, String materialOfDrum) {
        super(price, coverThickness);
        this.sizeOfDrum = sizeOfDrum;
        this.materialOfDrum = materialOfDrum;
    }

    /**
     * Method overides the toString method
     * @return a new string containg price and serial number
     */
    public String toString() {
        return "The Snare Drum's Price is " + this.getPrice() + "/n"
            + "The serial number is " + this.getSerialNumber();
    }

    /**
     * Method plays the soudn of a snare drum
     * @return a string containg the noise
     */
    public String play() {
        return "Datdatatata";
    }

}
