package Lab2c;

/*
* Charger.charge() requires an object input that inherits from Chargeable interface.
* Hence, make the MobileComputer a type of Chargeable, i.e. implement Chargeable interface can solve the problem. */

public class MobileComputer extends Computer implements Chargeable {
    private int battery;

    public MobileComputer() {
        secret = "MobileComputer secret";
        battery = 5;
    }

    @Override
    public void work() {
        if (battery > 0) {
            System.out.println("It is working on my lap.");
            battery--;
        } else {
            System.out.println("Running out of battery");
        }
    }

    public void charge() {
        if (battery < 10) {
            battery++;
        }
    }
}
