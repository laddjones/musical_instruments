/**
 * Represents a percussion instrument
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public abstract class Percussion extends Instrument {
    private double coverThickness;

    /**
     * Constructor that intilizes the price and coverThickness
     * @param price           price of the instrument
     * @param coverThickness  coverthickness of percussion instrument
     */
    public Percussion(double price, double coverThickness) {
        super(price);
        this.coverThickness = coverThickness;
    }

}
