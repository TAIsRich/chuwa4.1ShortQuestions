Public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        /** Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new ArmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RunteimeException("Sorry")
        }

        coffee.addMilk();
        coffee.addSugar();
         return coffee;
         **/
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = factroy.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}