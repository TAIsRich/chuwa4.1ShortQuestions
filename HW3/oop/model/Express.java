package oop.expense.model;

/**
 * data abstraction and encapsulation
 *@ClassName Express
 *@Description TODO
 */
public class Express extends AbstractExpress{

    private double unitPricePerPondPerMile;// unit price
    private double floorPrice;// floor price

    public Express(String name, double unitPricePerPondPerMile, double floorPrice){
        super(name);
        this.unitPricePerPondPerMile = unitPricePerPondPerMile;
        this.floorPrice = floorPrice;
    }

    public double getUnitPricePerPondPerMile() {
        return unitPricePerPondPerMile;
    }

    public void setUnitPricePerPondPerMile(double unitPricePerPondPerMile) {
        this.unitPricePerPondPerMile = unitPricePerPondPerMile;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }
}
