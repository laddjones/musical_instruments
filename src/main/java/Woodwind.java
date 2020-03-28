/**
 * Represents a woodwind of type instrument
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public abstract class Woodwind extends Instrument {
    private double reedSize;


  /**
   * Constructor intilizes the price and reedSize
   * @param price           price of woodwind  instrument
   * @param reedSize        size of reed
   */
    public Woodwind(double price, double reedSize) {
        super(price);
        this.reedSize = reedSize;
    }


}
