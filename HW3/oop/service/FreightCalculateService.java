package oop.expense.service;

import oop.expense.model.Express;

/**
 * interface
 *@ClassName FreightCalculationService
 *@Description TODO
 */
public interface FreightCalculateService {

    double expenseCalculate(Express express, double weight, double distance) throws IllegalArgumentException;

    double expenseCalculate(Express express, double weight, double distance, boolean enableFloorPrice) throws IllegalArgumentException;

    double expenseCalculate(Express express, double weight, double distance, double discount)throws IllegalArgumentException;
}
