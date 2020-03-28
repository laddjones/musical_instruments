/**
 * Represents a music store
 * @author Ladd Jones
 * @version Oct.15 2015
 */

public class MusicStore {

  /**
 * Tests all of the methods in Instrument and Musician
 * @param args takes in a value
 */
    public static void main(String[] args) {
        Musician newMusician = new Musician("Ladd", 98.30,
            new Violin(7.8, 9.3, 3.4, "Mahogony"));

        System.out.println("________________________________________________");
        System.out.println("The fund's of myMusician "
            + "before purchasing anything: " + newMusician.getMyFunds());

        System.out.println("________________________________________________");
        System.out.print("The price of the newMuscian's instruments is: ");
        for (int i = 0; i < newMusician.getMyInstruments().size(); i++) {
            System.out.print(newMusician.getMyInstruments().get(i).getPrice()
                + ", ");
        }
        System.out.println("");
        System.out.println("________________________________________________");
        System.out.println("The serial number of the newMusician's instruments"
            + " is: ");
        for (int i = 0; i < newMusician.getMyInstruments().size(); i++) {
            System.out.print(newMusician.getMyInstruments().get(i).
                getSerialNumber() + ", ");
        }
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("The noise that each of newMusician's instruments"
            + " make is: ");
        for (int i = 0; i < newMusician.getMyInstruments().size(); i++) {
            System.out.print(newMusician.getMyInstruments().get(i).play()
                + ", ");
        }
        System.out.println("");

        System.out.println("________________________________________________");
        System.out.println("the toString return of newMusician's instruments"
            + "is: ");
        for (int i = 0; i < newMusician.getMyInstruments().size(); i++) {
            System.out.print(newMusician.getMyInstruments().get(i).toString()
                + ", ");
        }
        System.out.println("");

        System.out.println("________________________________________________");

        System.out.println("Trying to buy the same instrument and failing");
        try {
            newMusician.purchase(newMusician.getMyInstruments().get(0));
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("________________________________________________");

        System.out.println("Trying to buy an instrument without enough funds"
            + " and failing");
        try {
            newMusician.purchase(new Flute(190.9, 9.3, 3.4, "Mahogony"));
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("________________________________________________");
        System.out.println("Trying to sell your last instrument and failing");
        try {
            newMusician.sell(newMusician.getMyInstruments().get(0));
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println("________________________________________________");

        System.out.println("Purchasing snare drum and then printing"
            + " your intruments ");
        try {
            newMusician.purchase(new SnareDrum(8.9, 9.3, 3.4, "SheepSkin"));
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        for (int i = 0; i < newMusician.getMyInstruments().size(); i++) {
            System.out.print(newMusician.getMyInstruments().get(i) + ", ");
            System.out.println("");
        }
        System.out.println("Updated fund's of myMusician: "
            + newMusician.getMyFunds());
        System.out.println("________________________________________________");

        System.out.println("Selling the violin that you already have and"
            + " updating newMuscian's funds");
        try {
            newMusician.sell(newMusician.getMyInstruments().get(0));
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println(newMusician.getMyFunds());




                // try {
                //     newMusician.sell(new Violin(7.8,9.3, 3.4, "Mahogony"));
                // } catch (Exception e1) {
                //       System.out.println(e1.getMessage());
                // }

                // Musician newMusician2 = new Musician("Tom", 70.20, new
                // Trumpet(2.1,7.5, 9.8, "Copper"));
                // Musician newMusician3 = new Musician("Sarah", 40.50, new
                // SnareDrum(6.2,1.3, 8.1, "BullSkin"));
                // Musician newMusician4 = new Musician("Paul", 3.30, new
                // Flute(49.8, 4.3, 5.2, "HighSound"));
    }
}
