/**
 * Represents an instrument
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public abstract class Instrument {
    private double price;
    private int serialNumber;


  /**
   * Constructor intilizes the price and creates a serial number
   * @param price           price of instrument
   */

    public Instrument(double price) {
        this.price = price;
        serialNumber = (int) (Math.random() * 50000);
    }

    /**
     * Method gets the price of an instrument
     * @return    returns the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method gets the serial number of an instrument
     * @return    returns the serial number
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * Method gets the sound of an instrument
     * @return    returns the sound
     */
    public abstract String play();

    /**
     * Method overides the equals method of an instrument
     * @param obj      object imput
     * @return returns a boolean of whether or not they are equal
     */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Instrument)) {
            return false;
        }
        Instrument instr = (Instrument) obj;
        return (instr.getSerialNumber() == this.getSerialNumber());
    }

    /**
     * Method overides the hashCode method of an instrument
     * @return 1 returns 1
     */
    public int hashCode() {
        return 1;
    }
}
