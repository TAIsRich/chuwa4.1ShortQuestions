package pattern.builderpattern;

public class MobileBuilder extends Builder {

    public void buildFrame() {
        bike.setFrame("some frame 1");
    }

    public void buildSeat() {
        bike.setSeat("some seat 1");
    }

    public Bike createBike() {
        return bike;
    }
}
