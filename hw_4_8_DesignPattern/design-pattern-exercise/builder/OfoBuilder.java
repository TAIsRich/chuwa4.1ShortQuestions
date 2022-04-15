public class OfoBuilder extends Builder {
    public void buildFrame() {
        bike.setFrame("Lu");
    }

    public void buildSeat() {
        bike.setSeat("Rubber");
    }

    public Bike createBike() {
       return bike;
    }
}