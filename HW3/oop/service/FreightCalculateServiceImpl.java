package oop.expense.service;

import oop.expense.model.Express;

/**
 * interface implementation override overload
 *@ClassName FreightCalculationServiceImpl
 *@Description TODO
 */
public class FreightCalculateServiceImpl implements FreightCalculateService {

    /**
     *
     * @param express
     * @param weight greater than 0
     * @param distance greater than 0
     * @return
     */
    @Override
    public double expenseCalculate(Express express, double weight, double distance) throws IllegalArgumentException{
        if (weight <= 0d || distance <= 0d){
            throw new IllegalArgumentException("weight and distance should be greater than 0");
        }
        return express.getUnitPricePerPondPerMile() * weight * distance;
    }

    /**
     *
     * @param express
     * @param weight greater than 0
     * @param distance greater than 0
     * @param enableFloorPrice
     * @return
     */
    @Override
    public double expenseCalculate(Express express, double weight, double distance, boolean enableFloorPrice)throws IllegalArgumentException{
        if (weight <= 0d || distance <= 0d){
            throw new IllegalArgumentException("weight and distance should be greater than 0");
        }
        double expense = express.getUnitPricePerPondPerMile() * weight * distance;
        if (enableFloorPrice){
            return expense < express.getFloorPrice() ? express.getFloorPrice() : expense;
        }else {
            return expense;
        }
    }

    /**
     *
     * @param express
     * @param weight greater than 0
     * @param distance greater than 0
     * @param discount [0.0, 1.0)
     * @return
     */
    @Override
    public double expenseCalculate(Express express, double weight, double distance, double discount)throws IllegalArgumentException{
        if (weight <= 0d || distance <= 0d){
            throw new IllegalArgumentException("weight and distance should be greater than 0");
        }
        if (discount < 0d || discount >= 1d){
            throw new IllegalArgumentException("discount should be between 0 and 1");
        }
        return express.getUnitPricePerPondPerMile() * weight * distance * (1d - discount);
    }

}
