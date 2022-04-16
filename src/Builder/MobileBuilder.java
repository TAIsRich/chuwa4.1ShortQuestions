package Builder;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Tanqianwei");
    }

    @Override
    public void buildeSeat() {
        bike.setSeat("Zhenpi");

    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
