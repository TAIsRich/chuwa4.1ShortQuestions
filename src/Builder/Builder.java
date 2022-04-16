package Builder;

public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildeSeat();
    public abstract Bike creatBike();
}
