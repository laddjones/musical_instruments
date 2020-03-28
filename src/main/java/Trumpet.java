/**
 * Represents a trumpet
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public class Trumpet extends Brass {
    private double sizeOfTrumpet;
    private String typeOfMetal;

    /**
     * Constructor intilizes the price, mouthPieceSize, sizeOfTrumpet, and
     * mouthPieceSize
     * @param price           price of trumpet
     * @param mouthPieceSize  mouthpiece size
     * @param sizeOfTrumpet   size of trumpet
     * @param typeOfMetal  type of metal
     */
    public Trumpet(double price, double mouthPieceSize,
        double sizeOfTrumpet, String typeOfMetal) {
        super(price, mouthPieceSize);
        this.sizeOfTrumpet = sizeOfTrumpet;
        this.typeOfMetal = typeOfMetal;
    }

    /**
     * Method overides the toString method
     * @return a new string containg price and serial number
     */
    public String toString() {
        return "The Trumpet's Price is " + this.getPrice() + "/n"
            + "The serial number is " + this.getSerialNumber();
    }

    /**
     * Method plays the sound o f a trumpet
     * @return a string containg the noise
     */
    public String play() {
        return "Tutututu";
    }
}
