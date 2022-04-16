public class MobileBuilder extends Builder {
    public void buildFrame() {
        bike.setFrame("A");
    }

    public void buildSeat() {
        bike.setSeat("B");
    }

    public Bike createBike() {
        return bike;
    }
}