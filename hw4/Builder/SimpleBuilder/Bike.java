package Builder.SimpleBuilder;

public class Bike {
    private String frame;
    private String seat;
    public String getFrame() {
        return frame;
    }
    public void setFrame(String frame) {
        this.frame = frame;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
}

abstract class Builder {
    protected Bike mBike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}

class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }
    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }
    @Override
    public Bike createBike() {
        return mBike;
    }
}

class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }
    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }
    @Override
    public Bike createBike() {
        return mBike;
    }
}

class Director {
    private Builder mBuilder;
    public Director(Builder builder) {
        mBuilder = builder;
    }
    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}

class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
