/**
 * Represents a unique exception class
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public class DontHaveEnoughFunds extends Exception {

  /**
   * Constructor implents custom exception
   */
    public DontHaveEnoughFunds() {
        super("Error: You do not have enough funds!");
    }
}
