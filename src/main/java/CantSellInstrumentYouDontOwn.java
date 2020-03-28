/**
 * Represents a unique exception class
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public class CantSellInstrumentYouDontOwn extends Exception {

  /**
   * Constructor implents custom exception
   */
    public CantSellInstrumentYouDontOwn() {
        super("Error: You can not sell an instrument that you don't"
            + "already own!");
    }
}
