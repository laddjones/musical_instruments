import java.util.ArrayList;

/**
 * Represents a musician
 * @author Ladd Jones
 * @version Oct.15 2015
 */
public class Musician {
    private ArrayList<Instrument> myInstruments = new ArrayList<Instrument>();
    private String myName;
    private double myFunds;


    /**
     * Constructor implments your name, your funds, and your instruments
     *  @param myName                 your name
     *  @param myFunds               your funds
     *  @param startingInstruments   your instruments
     */
    public Musician(String myName, double myFunds,
        Instrument ... startingInstruments) { //implements
        this.myName = myName;
        this.myFunds = myFunds;
        for (int i = 0; i < startingInstruments.length; i++) {
            myInstruments.add(startingInstruments[i]);
        }
    }

    /**
     * method gets your instruments
     * @return myInstruments returns your instrument
     */
    public ArrayList<Instrument> getMyInstruments() {
        return myInstruments;
    }

    /**
     * method gets your name
     * @return myName returns your name
     */
    public String getMyName() {
        return myName;
    }

    /**
     * method gets your instrument's funds
     * @return myFunds returns fudns
     */
    public double getMyFunds() {
        return myFunds;
    }

    /**
     * method allows you to make a purchase
     * @param newInstrument instrument you want to purchase
     * @throws Exception threw an exception
     */
    public void purchase(Instrument newInstrument) throws Exception {
        exception1Funds(newInstrument);
        exception2SameTwice(newInstrument);
        myInstruments.add(newInstrument);
        myFunds = myFunds - newInstrument.getPrice();
    }

    /**
     * method allows you to make a throw a specific exception
     * @param newInst instrument you want to compare
     * @throws DontHaveEnoughFunds threw specific exception
     */
    public void exception1Funds(Instrument newInst) throws DontHaveEnoughFunds {
        if (!(this.doYouHaveFunds(newInst))) {
            throw new DontHaveEnoughFunds();
        }
    }

    /**
     * method allows you to throw a specific expection
     * @param newInst instrument you want to compare
     * @throws CantBySameOneTwice threw specific exception
     */
    public void exception2SameTwice(Instrument newInst) throws
    CantBySameOneTwice {
        if (this.doYouAlreadyHaveOne(newInst)) {
            throw new CantBySameOneTwice();
        }
    }

    /**
     * method allows you to see if you have enough funds
     * @param  testerInstrument instrument you want to compare
     * @return this.getMyFunds() >= testerInstrument.getPrice() returns whether
     * you have the funds
     */
    public boolean doYouHaveFunds(Instrument testerInstrument) {
        return (this.getMyFunds() >= testerInstrument.getPrice());
    }

    /**
     * method allows you to see if you already have that instrument
     * @param  testerInstrument instrument  you want to compare
     * @return returns true or false
     */
    public boolean doYouAlreadyHaveOne(Instrument testerInstrument) {
        for (int i = 0; i < myInstruments.size(); i++) {
            if (myInstruments.get(i).equals(testerInstrument)) {
                return true;
            }
        }
        return false;
    }

    /**
     * method allows you to sell something
     * @param  removeInstrument instrument you want to remove
     * @throws Exception threw specific exception
     */
    public void sell(Instrument removeInstrument) throws Exception {
        exception3Last(removeInstrument);
        exception4DontHave(removeInstrument);
        myInstruments.remove(removeInstrument);
        myFunds = myFunds + removeInstrument.getPrice();
    }

    /**
     * method allows you to throw a specific expection
     * @param  removeInst instrument you want to compare
     * @throws CantSellLastInstrument threw specific exception
     */
    public void exception3Last(Instrument removeInst)
        throws CantSellLastInstrument {
        if (this.isItYourLast()) {
            throw new CantSellLastInstrument();
        }
    }

    /**
     * method allows you to throw a specific expection
     * @param  removeInst instrument you want to compare
     * @throws CantSellInstrumentYouDontOwn threw specific exception
     */
    public void exception4DontHave(Instrument removeInst)
        throws CantSellInstrumentYouDontOwn {
        if (!(this.doYouOwnIt(removeInst))) {
            throw new CantSellInstrumentYouDontOwn();
        }
    }

    /**
     * method allows you to see if it is your last instrument
     * @return (myInstruments.size() < 2) returns true or false
     */
    public boolean isItYourLast() {
        return (myInstruments.size() < 2);
    }

    /**
     * method allows you to see if you actually own the instrument
     * @param testerInstrument the instrument you want to compare
     * @return returns true or false
     */
    public boolean doYouOwnIt(Instrument testerInstrument) {
        for (int i = 0; i < myInstruments.size(); i++) {
            if (myInstruments.get(i).equals(testerInstrument)) {
                return true;
            }
        }
        return false;
    }
}
