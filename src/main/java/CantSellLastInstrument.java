/**
 * Represents a unique exception class
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public class CantSellLastInstrument extends Exception {

  /**
  * Constructor implents custom exception
  */
    public CantSellLastInstrument() {
        super("Error: You cannot sell your last instrument!");
    }
}
