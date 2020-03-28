/**
 * Represents a stringed instrument
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public abstract class Stringed extends Instrument {
    private double stringThickness;

    /**
     * Constructor intilizes the price, stringThickness
     * @param price           price of stringed instrument
     * @param stringThickness  string thickness of instrument
     */
    public Stringed(double price, double stringThickness) {
        super(price);
        this.stringThickness = stringThickness;
    }
}
