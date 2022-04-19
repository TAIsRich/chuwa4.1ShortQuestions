package builder;

public class Client {

    Director director = new Director(new MobileBuilder());

    Bike bike = director.construct();

    System.out.println(bike.getFrame());
    System.out.println(bike.getSeat());
}
