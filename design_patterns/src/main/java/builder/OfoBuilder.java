package builder;

public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("香蕉");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
