package oop.expense;

import oop.expense.model.Express;
import oop.expense.service.FreightCalculateService;
import oop.expense.service.FreightCalculateServiceImpl;

import java.util.List;

/**
 *@ClassName ExpressDemo
 *@Description TODO
 */
public class FreightCalculationDemo {

    public static void main(String[] args) {
        // when buying something online, expense calculation is necessary depends on different express and different policy

        Express fedex = new Express("FedEx", 0.05d, 10d);
        Express ups = new Express("UPS", 0.04d, 4d);
        Express dhl = new Express("DHL", 0.02d, 3d);

        List<Express> expresses = List.of(fedex, ups, dhl);

        FreightCalculateService freightCalculateService = new FreightCalculateServiceImpl();

        // calculate by default
        System.out.println("\ncalculate by default");
        for (Express express : expresses) {
            double weight = 5d;
            double distance = 25d;
            double expense = freightCalculateService.expenseCalculate(express, weight, distance);
            System.out.printf("express[%s] expense[$ %s] to deliver good with %s ponds and %s miles\n",
                    express.getName(), expense, weight, distance);
        }

        // calculate when enable floor price
        System.out.println("\ncalculate when enable floor price");
        for (Express express : expresses) {
            double weight = 5d;
            double distance = 25d;
            double expense = freightCalculateService.expenseCalculate(express, weight, distance, true);
            System.out.printf("express[%s] expense[$ %s] to deliver good with %s ponds and %s miles when enable floor price\n",
                    express.getName(), expense, weight, distance);
        }

        // calculate with discount
        System.out.println("\ncalculate with discount");
        for (Express express : expresses) {
            double weight = 5d;
            double distance = 25d;
            double discount = 0.2d;
            double expense = freightCalculateService.expenseCalculate(express, weight, distance, discount);
            System.out.printf("express[%s] expense[$ %s] to deliver good with %s ponds and %s miles with discount[%s%% off]\n",
                    express.getName(), expense, weight, distance, discount*100);
        }

        // exception handling
        try {
            double weight = -5d;
            double distance = -25d;
            double expense = freightCalculateService.expenseCalculate(fedex, weight, distance);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

}
