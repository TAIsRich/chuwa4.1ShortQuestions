package pattern.builderpattern;

public class OfoBuilder extends Builder {
    public void buildFrame() {
        bike.setFrame("some frame 2");
    }

    public void buildSeat() {
        bike.setSeat("some seat 2");
    }

    public Bike createBike() {
        return bike;
    }
}
