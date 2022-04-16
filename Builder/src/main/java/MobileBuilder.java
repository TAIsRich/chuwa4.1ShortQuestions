public class MobileBuilder extends Builder {

    public void buildFrame() {
        bike.setFrame("frame1");
    }
    public void buildSeat() {
        bike.setSeat("seat1");
    }
    public Bike createBike() {
        return bike;
    }
}
