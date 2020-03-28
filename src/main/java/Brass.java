/**
 * Represents a Brass Instrument
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public abstract class Brass extends Instrument {
    private double mouthPieceSize;

    /**
     * Constructor intilizes the price and mouthPieceSize
     * @param price           price of brass instrument
     * @param mouthPieceSize  size of mouthpiece
     */
    public Brass(double price, double mouthPieceSize) {
        super(price);
        this.mouthPieceSize = mouthPieceSize;
    }


}
