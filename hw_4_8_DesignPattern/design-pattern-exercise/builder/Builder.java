
public avstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public avstract Bike createBuilder();
}