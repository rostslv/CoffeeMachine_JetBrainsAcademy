public class CoffeeMachine {
    private int waterNow;
    private int milkNow;
    private int coffeeBeansNow;
    private int disposableCupsNow;
    private int moneyNow;

    public CoffeeMachine(int waterNow, int milkNow, int coffeeBeansNow, int disposableCupsNow, int moneyNow) {
        this.waterNow = waterNow;
        this.milkNow = milkNow;
        this.coffeeBeansNow = coffeeBeansNow;
        this.disposableCupsNow = disposableCupsNow;
        this.moneyNow = moneyNow;
    }

    public void buy (Coffee coffee) {
        if (waterNow > coffee.getWaterNeed() && milkNow > coffee.getMilkNeed() && coffeeBeansNow > coffee.getCoffeeBeansNeed() && disposableCupsNow > 0) {
            waterNow = waterNow - coffee.getWaterNeed();
            milkNow = milkNow - coffee.getMilkNeed();
            coffeeBeansNow = coffeeBeansNow - coffee.getCoffeeBeansNeed();
            disposableCupsNow = disposableCupsNow - 1;
            moneyNow = moneyNow + coffee.getCost();
            System.out.println("I have enough resources, making you coffee!");
            System.out.println();
        } else {
            if (waterNow < coffee.getWaterNeed()) {
                System.out.println("Sorry, not enough water!");
            } else if (milkNow < coffee.getMilkNeed()) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeansNow < coffee.getCoffeeBeansNeed()) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (disposableCupsNow == 0) {
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    public void fill (int waterAdd, int milkAdd, int coffeeBeansAdd, int disposableCupsAdd) {
        waterNow = waterNow + waterAdd;
        milkNow = milkNow + milkAdd;
        coffeeBeansNow = coffeeBeansNow + coffeeBeansAdd;
        disposableCupsNow = disposableCupsNow + disposableCupsAdd;
    }

    public void take () {
        System.out.println("I gave you $" + moneyNow);
        moneyNow = 0;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                waterNow + " of water\n" +
                milkNow + " of milk\n" +
                coffeeBeansNow + " of coffee beans\n" +
                disposableCupsNow + " of disposable cups\n" +
                "$" + moneyNow + " of money\n";
    }
}
