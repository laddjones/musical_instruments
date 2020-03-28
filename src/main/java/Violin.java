/**
 * Represents a violin
 * @author Ladd Jones
 * @version Oct.15 2015
 */
public class Violin extends Stringed {
    private double sizeOfViolin;
    private String typeOfWood;

    /**
     * Constructor intilizes the price, stringThickness, sizeOfViolin, and
     * typeOfWood
     * @param price            price of violin
     * @param stringThickness  string thickness of violin
     * @param sizeOfViolin     size of violin
     * @param typeOfWood       type of wood of violin
     */
    public Violin(double price, double stringThickness,
        double sizeOfViolin, String typeOfWood) {
        super(price, stringThickness);
        this.sizeOfViolin = sizeOfViolin;
        this.typeOfWood = typeOfWood;
    }

    /**
     * Method overides the toString method
     * @return a new string containg price and serial number
     */
    public String toString() {
        return "The Violin's Price is " + this.getPrice() + "/n"
            + "The serial number is " + this.getSerialNumber();
    }

    /**
     * Method plays the sound of a violin
     * @return a string containg the noise
     */
    public String play() {
        return "Vwawawawa";
    }
}
