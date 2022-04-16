package Builder;

public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("Lvhejing");

    }

    @Override
    public void buildeSeat() {
        bike.setSeat("Xiangjiao");

    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
