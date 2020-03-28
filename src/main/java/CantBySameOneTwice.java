/**
 * Represents a unique exception class
 * @author Ladd Jones
 * @version Oct.15 2015
 */
public class CantBySameOneTwice extends Exception {

  /**
  * Constructor implents custom exception
  */
    public CantBySameOneTwice() {
        super("Error: You cannot by the same intrument twice!");
    }
}
